package sarasai;

public class SarasaiNamuDarbas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        MyList ml = new MyList();
        Sarasas ml = new MyList();
        System.out.println(ml.toString());
        // {}
        System.out.println(ml.size());
        // 0
        
        ml.add("pirmas");
        System.out.println(ml.toString());
        // {pirmas}
        System.out.println(ml.size());
        // 1

        ml.add("antras");
        System.out.println(ml.toString());
        // {pirmas, antras}
        System.out.println(ml.size());
        // 2

        ml.add("trecias");
        System.out.println(ml.toString());
        // {pirmas, antras, trecias}
        System.out.println(ml.size());
        // 3
        
        System.out.println(ml.get(0));
        // pirmas
        System.out.println(ml.get(2));
        // trecias
        try {
            System.out.println(ml.get(-3));
        } catch (IndexOutOfBoundsException ex) {
            // ignored
        }
        try {
            System.out.println(ml.get(3));
        } catch (IndexOutOfBoundsException ex) {
            // ignored
        }
        
        ml.set(1, "kitas antras");
        System.out.println(ml.toString());
        // {pirmas, kitas antras, trecias}
        System.out.println(ml.size());
        // 3
        System.out.println(ml.get(1));
        // kitas antras
        
        System.out.println("remove");
        ml.remove(1);
        System.out.println(ml.toString());
        // {pirmas, trecias}
        System.out.println(ml.size());
        // 2
        System.out.println(ml.get(1));
        // trecias
        
        ml.insert(0, "nulis");
        System.out.println(ml.toString());
        // {nulis, pirmas, trecias}
        System.out.println(ml.size());
        // 3
        System.out.println(ml.get(0));
        // nulis

        ml.insert(2, "pries trecia");
        System.out.println(ml.toString());
        // {nulis, pirmas, pries trecia, trecias}
        System.out.println(ml.size());
        // 4
        System.out.println(ml.get(2));
        // pries trecia
    }
    
}
/*
Sukurti klase
MyList

void add(Object o);

void remove(int index);

Object get(int index);

void set(int index, Object o);

int size();

String toString();

***
void insert(int index, Object o);


*/

/*
Sukurti klase
MyLinekdList

void add(Object o);

void remove(int index);

Object get(int index);

void set(int index, Object o);

int size();

String toString();

***
void insert(int index, Object o);


*/
