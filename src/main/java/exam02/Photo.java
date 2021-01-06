package exam02;

public class Photo implements Qualified
{
    String name;
    Quality qual;

    public Photo(String name) {
        this.name = name;
    }

    public Photo(String name, Quality qual) {
        this.name = name;
        this.qual = qual;
    }


    @Override
    public Quality getQuality() {
        return qual;
    }

    @Override
    public void setQuality(Quality q) {
          qual = q;
    }
}
