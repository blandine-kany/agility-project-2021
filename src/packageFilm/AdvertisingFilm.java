package packageFilm;

import packagePhone.Phone;

public class AdvertisingFilm extends MovingPicture {

    private Phone phone;

    public AdvertisingFilm(String title, String director, Phone phone) {
        this.title = title;
        this.director = director;
        this.phone = phone;
    }

    @Override
    public String information() {
        return "Advertising Film: " + this.title + " by director " + this.director + " for " + this.phone.getName();
    }

    @Override
    public String hirePeople() {
        return "People to hire: Cameramen, Screen writer, Producer";

    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AdvertisingFilm) {
            AdvertisingFilm film1 = (AdvertisingFilm) obj;
            return film1.title.equals(this.title) && film1.director.equals(this.director) && film1.phone.equals(this.phone);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 7 * hash + (this.director != null ? this.director.hashCode() : 0);
        hash = 7 * hash + (this.title != null ? this.title.hashCode() : 0);
        hash = 7 * hash + (this.phone != null ? this.phone.hashCode() : 0);
        return hash;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }
}
