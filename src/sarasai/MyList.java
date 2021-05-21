package sarasai;

public class MyList implements Sarasas {
    
    private Object[] list;
    
    public MyList() {
        this.list = new Object[0];
    }

    public void add(Object o) {
        // sukuriam nauja masyva, vienu elementu didesni negu buvo
        Object[] newList = new Object[this.list.length + 1];
        
        // nukopijuojam is seno masvyo visas esamas reiksmes
        for (int i = 0; i < this.list.length; i++) {
            newList[i] = this.list[i];
        }
        
        // i paskutine (nauja) vieta irasom nuoroda i prideta objekta
        newList[newList.length - 1] = o;
        
        // nuo siol naudosimes ilgesniu masyvu
        this.list = newList;
    }

    public void remove(int index) {
        if (index < 0 || index >= this.list.length) {
            return;
        }
        Object[] newList = new Object[this.list.length - 1];
        
        for (int i = 0, j = 0; i < this.list.length; i++) {
            if (i != index) {
                newList[j++] = this.list[i];
            }
        }
        
        this.list = newList;
    }

    public Object get(int index) {
        if (index < 0 || index >= this.list.length) {
            return null;
        }
        return this.list[index];
    }

    public void set(int index, Object o) {
        if (index < 0 || index >= this.list.length) {
            return;
        }
        this.list[index] = o;
    }

    public void insert(int index, Object o) {
        if (index < 0 || index >= this.list.length) {
            return;
        }
        Object[] newList = new Object[this.list.length + 1];
        
        for (int i = 0, j = 0; i < newList.length; i++) {
            if (i == index) {
                newList[i] = o;
            } else {
                newList[i] = this.list[j++];
            }
        }
        
        this.list = newList;

    }

    public int size() {
        return this.list.length;
    }

    public String toString() {
        String ret = "{";
        for (int i = 0; i < this.list.length; i++) {
            if (i > 0) {
                ret += ", ";
            }
            ret += this.list[i];
        }
        ret += "}";
        return ret;
    }

}
/*
susikrti unchecked klaidos klase

ir metoduose remove, insert, get throw'inti klaida

*/
