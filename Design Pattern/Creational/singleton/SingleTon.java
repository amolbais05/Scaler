package singleton;

public class SingleTon {

    private static SingleTon singleTon = null;

    private SingleTon() {}

    public static SingleTon getInstance()
    {
        if (null == singleTon)
        {
            synchronized (SingleTon.class)
            {
                if (null == singleTon)
                {
                    singleTon= new SingleTon();
                }
            }
        }

        return singleTon;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
