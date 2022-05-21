package aula05;

public enum TipoDano {

    FOGO("fogo"),
    PERFURANTE("perfurante"),
    PANCADA("pancada");

    public final String label;

    private TipoDano(String label) {
        this.label = label;
    }
}
