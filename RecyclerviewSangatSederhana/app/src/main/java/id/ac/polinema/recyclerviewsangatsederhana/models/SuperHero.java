package id.ac.polinema.recyclerviewsangatsederhana.models;

public class SuperHero {
    public String heroName, heroPhoto;

    public SuperHero(String heroPhoto,String heroName) {
        this.heroPhoto = heroPhoto;
        this.heroName = heroName;
    }

    public String getHeroPhoto() {
        return heroPhoto;
    }

    public void setHeroPhoto(String heroPhoto) {
        this.heroPhoto = heroPhoto;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }
}