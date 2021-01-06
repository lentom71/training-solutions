package exam02;

import java.util.ArrayList;
import java.util.List;

public class PhotoCollection {
    List<Photo> photos = new ArrayList<>();

    public void addPhoto(String... names)
    {
        for (String n : names)
        {
            photos.add(new Photo(n));
        }
    }

    public void starPhoto(String nev, Quality qual)
    {
        for(int i=0; i < photos.size(); i++)
        {
            if(photos.get(i).name == nev)
            {
                photos.get(i).setQuality(qual);
            }
            else
            {
                throw   new PhotoNotFoundException(("Nincs  ilyen!"));
            }
        }
    }

    public int  numberOfStars()
    {
        int szam =0;
        for(int i=0; i < photos.size(); i++)
        {
            if(photos.get(i).qual ==  Quality.NO_STAR)
            {
                szam = szam +  0;
            }
            if(photos.get(i).qual ==  Quality.ONE_STAR)
            {
                szam =  szam + 1;
            }
            if(photos.get(i).qual ==  Quality.NO_STAR)
            {
                szam = szam + 2;
            }

        }
        return szam;
    }
}
