package packageFilm;

import java.util.List;


public class MovingPictureIterator implements Iterator<MovingPicture> {

    private List<MovingPicture> movingPictureList;
    private int currentIndex;

    public MovingPictureIterator(List<MovingPicture> movingPictureList) {
        this.movingPictureList = movingPictureList;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return this.currentIndex < this.movingPictureList.size();
    }

    @Override
    public MovingPicture next() {
        //if(this.hasNext())
        return this.movingPictureList.get(this.currentIndex++);
        //else return null;
    }

    /*@Override
    public void reset() {
        this.currentIndex = 0;
    }*/

    @Override
    public MovingPicture currentItem() {
        return this.movingPictureList.get(this.currentIndex);
    }


}
