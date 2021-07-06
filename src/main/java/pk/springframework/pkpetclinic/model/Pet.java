package pk.springframework.pkpetclinic.model;

import java.time.LocalDate;

public class Pet {

    private Petype petype;
    private Owner owner;
    private LocalDate localDate;

    public Petype getPetype() {
        return petype;
    }

    public void setPetype(Petype petype) {
        this.petype = petype;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }
}
