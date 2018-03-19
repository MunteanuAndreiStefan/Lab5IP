import java.util.Date;

public class Main {
        public static void main(String[] args) {
            Tara romania=new Tara("Romania",1000);
            System.out.println(romania);
            Codpostal cod = new Codpostal(1234, new Tara("Romania", 123));
            System.out.println(cod);
            Adresa adresa=new Adresa(100,new Date(2018,03,10),new Date(2018,03,19),cod,1);
            System.out.println(adresa);
            Categorie categorie=new Categorie("ceva",2);
            System.out.println(categorie);
            Comanda comanda=new Comanda(200);
            System.out.println(comanda);
            Comentariu comentariu=new Comentariu("Ion","un exemplu",400,5);
            System.out.println(comentariu);
            CosDeCumparaturi cos = new CosDeCumparaturi();
            System.out.println(cos);
            ListaProduse lista=new ListaProduse();
            System.out.println(lista);
            Neperisabil neperisabil=new Neperisabil(new Date(2020,05,20));
            System.out.println(neperisabil);
            Perisabil perisabil=new Perisabil(new Date(2020,07,20));
            System.out.println(perisabil);
            Produs produs=new Produs(500,categorie, 55);
            System.out.println(produs);
            Outh outh=new Outh("abcd");
            System.out.println(outh);
            Utilizator utilizator=new Utilizator("Popescu","12345",true,outh,"popescu@gmail.com");
            System.out.println(utilizator);
            modDePlata mod = new modDePlata();
            System.out.println(mod);
        }
}
