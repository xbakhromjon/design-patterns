Assalomu alaykum Hudo xohlasa bugundan
boshlab "Design Pattern" lar haqida ma'lumot berib boraman.

"Design Pattern" o'zi nima?
"Design Pattern" larni dasturiy ta'minot qurishda
uchraydigan odatiy muammolarga sinalgan yechimlar deyish mumkun.
Ularni kerakli joyda va to'g'ri ishlatilsa dasturiy ta'minotni
yaratish jarayonini tezlashishiga va osonlashiga olib keladi.
Keraksiz joyda ishlatishga urinish ortiqcha ishni ko'paytiradi va
har boshqa muammolarni keltirib chiqaradi.

"Design Pattern" lar 3 turga bo'linadi:

1. "Creational" - Obyektlarning yaratilishiga aloqador "pattern" lar.
2. "Structural" - Klass va obyektlardan tashkillashtirilgan tuzilmalarga aloqador "pattern" lar.
3. "Behavioral" - Obyektlar orasidagi o'zaro muloqotlarning umumiy usulublariga aloqador bo'lgan "pattern" lar.

Biz birinchi bo'lib "Behavioral Design Pattern" larni ko'rib chiqamiz.
Ular quyidagilar:

1. Chain of Responsibility
2. Command
3. Iterator
4. Mediator
5. Memento
6. Observer
7. State
8. Strategy
9. Template Method
10. Visitor


# Chain of Responsibility

Birinchi bu "pattern" ni g'oyasini tushuntirishga harakat qilaman.

Aytaylik bir dasturda "bug" chiqib qoldi. Foydalanuvchida shu "bug" tufayli
muammo chiqdi. Foydalanuvchi dasturni yaratgan kompaniyaning telefon raqamiga qo'ng'iroq qiladi.
Telefonni operator operator olib, muammosini eshitadi, agar hal qilib bera olsa, hal qiladi. Aks
holda shu dasturning "Project manager" iga bu muammo haqida xabar beradi. "Project Manager" ham hal qila olsa, hal
qiladi.
Aks holda shu "project" da ishlayotgan "Team Lead" ga aytadi. "Team Lead" da ham shu holat. Agar
hal qilib bera olmasa, A dasturchiga aytadi. A dasturchi ham qila olsa, hal qiladi. Agar kodga
tushunmasa, B dasturchiga aytadi. B dasturchida ham shu. Shu sikl muammo hal bo'lguncha yoki
muammoni hal qilishi mumkun bo'lgan kadrlar tugaguncha davom etadi. Natija mijozga to'g'ridan to'g'ri ko'rinadi.

Shu holat "Chain Of Responsibility Design Pattern" ini g'oyasiga misol bo'la oladi.

Agar bu "pattern" ni bilmasak mijoz muammosini hal qilish uchun operator, "Project Manager", "Team Lead",
A dasturchi, B dasturchiga o'zi birma - bir telefon qilishi kerak bo'lardi. Bunda unga har bir kadrning "contact" i
va ularni har biri bilan gaplashish uchun ortiqcha vaqt kerak bo'ladi. "Chain of Responsibilty Pattern" i hal qilgan,
asosiy muammo ham "client" ga har bir kadrning "contact" i kerak bo'lmasin. Bitta "contact" bilan muaammosini hal
qilsin.

Endi buni kodda ko'ramiz.

Topshiriq quyidagicha: Biz "txt", "ppt", "docx" fayllarni ochib beradigan dastur yozishimiz kerak.

File:
`

    public class File {

        private String extension;

        public File(String extension) {
            this.extension = extension;
        }

        public String getExtension() {
            return extension;
        }

        public void setExtension(String extension) {
            this.extension = extension;
        }
    }

`

TextDocumentHandler:

`

    public class TextDocumentHandler {
        
        public void openDocument() {
            System.out.println("Opening text document...");
        }
    }

`

SpreadSheetHandler:
`

    public class SpreadsheetHandler {

        public void openDocument() {
                System.out.println("Opening excel document...");
        }
    }

`

SlideshowHandler:
`

    public class SlideshowHandler {

        public void openDocument() {
            System.out.println("Opening slideshow document...");
        }
    }

`

Client:
`

    public class Client {
        public static void main(String[] args) {
            File file = new File("ppt");
            SpreadsheetHandler spreadsheetHandler = new SpreadsheetHandler();
            TextDocumentHandler textDocumentHandler = new TextDocumentHandler();
            SlideshowHandler slideshowHandler = new SlideshowHandler();
            if (file.getExtension().equals("ppt")) {
                slideshowHandler.openDocument();
            } else if (file.getExtension().equals("txt")) {
                textDocumentHandler.openDocument();
            } else if (file.getExtension().equals("xls")) {
                spreadsheetHandler.openDocument();
            } else {
                System.out.println("This document can't be open");
            }
        }
    }

`

Bu kodning 

1 - kamchiligi "client" aniq javob olmagunicha har bir "handler" ning "openDocument" metodini ishlatib
chiqadi. Ya'ni har bir kadr telefon qilib, gaplashib chiqishi kerak.
"Chain of Responsibility Pattern" ni bo'yicha
client bitta so'rov berishi kerak va javobi olishi kerak.

2 - kamchiligi "SOLID" printsplaridan "Open Closed" printspiga ham to'g'ri kelmaydi. Ya'ni agar yana boshqa hujjat turi
qo'shilsa mavjud kodning mantiqiy qismiga ham qo'shimcha
qo'shilishi kerak bo'lib qoladi.

Endi "pattern" bo'yicha bu kodni o'zgartirib ko'ramiz.

Bizga birinchi navbat "Handler" klasslarini umumlashtirish uchun "DocumentHandler abstract class" i kerak bo'ladi.

DocumentHandler:

`

    public abstract class DocumentHandler {
        private DocumentHandler next;
        
            public DocumentHandler(DocumentHandler next) {
                this.next = next;
            }
        
            public void openDocument(String fileExtension) {
                if (next != null) {
                    next.openDocument(fileExtension);
                }
            }
    }

`

Va "pattern" bo'yicha "next field" i bo'ladi. Ya'ni har bir "handler" obyekti muammoni hal qila olmasa qaysi "handler"
ga murojaat qilishini bilishi kerak. "Handler Concrete class" lar "DocumentHandler" dan "extend" oladi.

TextDocumentHandler:

`

    public class TextDocumentHandler extends DocumentHandler {
    
        public TextDocumentHandler(DocumentHandler next) {
            super(next);
        }
    
        public void openDocument(String fileExtension) {
            if (fileExtension.equals("txt")) {
                System.out.println("Opening text document...");
            } else {
                super.openDocument(fileExtension);
            }
        }
    }

`

"openDocument" metodi shu ko'rinishda o'zgaradi. Ya'ni agar muammoni hal qila olsa natijani qaytaradi/chiqaradi, aks
holda o'zidan keyingi "handler" ga o'tkazib yuboradi.

SpreadsheetHandler:

`

    public class SpreadsheetHandler extends DocumentHandler {
    
        public SpreadsheetHandler(DocumentHandler next) {
            super(next);
        }
    
        public void openDocument(String fileExtension) {
            if (fileExtension.equals("xls")) {
                System.out.println("Opening excel document...");
            } else {
                super.openDocument(fileExtension);
            }
        }
    }

`

Bunda ham xuddi shunday.

SlideshowHandler:
`

    public class SlideshowHandler extends DocumentHandler {
    
        public SlideshowHandler(DocumentHandler next) {
            super(next);
        }
    
        public void openDocument(String fileExtension) {
            if (fileExtension.equals("ppt")) {
                System.out.println("Opening slideshow document...");
            } else {
                super.openDocument(fileExtension);
            }
        }
    }

`

Bu ham shu ko'rinishda.

Client:
`

    public class Client {
        public static void main(String[] args) {
            File file = new File("ppt");
            DocumentHandler chain = new SlideshowHandler(new TextDocumentHandler(new SpreadsheetHandler(null)));
            chain.openDocument(file.getExtension());
        }
    }

`

"Client" klassi esa shunaqa oddiy ko'rinishga kelib qoladi.
Bu yerda "chain" "client" ning muammosini hal qilishi mumkun bo'lganlarning zanjiri. Zanjirning birinchi qismi "
SlideShowHandler", ya'ni, muammo birinchi bo'lib shunga keladi.
Hal qila olmasa, o'zi "TextDocument" ga o'tkazib yuboradi. Agar bu ham  hal qila olmasa "SpreadsheetHandler" ga o'tkazadi.
Mobodo bu "handler" ham hal qila olmasa,
boshqa handler qolmadi. Va muammoni hal qilib bo'lmaydi deb tushunish mumkun.


## Happy Learning!