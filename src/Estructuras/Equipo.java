package Estructuras;

public class Equipo implements Comparable<Equipo> {
    public int codigo;

    public Equipo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


    @Override
    public int compareTo(Equipo o) {
        return Integer.compare(this.codigo, o.codigo);
    }

    @Override
    public String toString() {
        return "" + codigo;
    }
}