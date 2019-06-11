package animal;

public enum TipoDoAnimal {
    CACHORRO("Cachorro"),
    GATO("Gato");

    private String tipoDoAnimalASerAtendido;

    TipoDoAnimal(String tipoDoAnimalASerAtendido) {
        this.tipoDoAnimalASerAtendido = tipoDoAnimalASerAtendido;
    }

    public String tipoDoAnimalASerAtendido() {
        return tipoDoAnimalASerAtendido;
    }
}
