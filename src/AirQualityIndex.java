import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 3/31/2015.
 */
public class AirQualityIndex {

    // ARRAY LIST FOR RECEIVING DATA
    List dataList = null;

    // ARRAY LIST FOR HOLDING AQI INTERVALS AND CONCENTRATION INTERVALS
    public static final int POLLUTANTCOUNT = 8;
    private static List concentration = new ArrayList(POLLUTANTCOUNT);
    private static List aqiInterval = new ArrayList(POLLUTANTCOUNT);

    public AirQualityIndex(List dataList) throws DataFormatException {
        this.dataList = dataList;

        if (dataList != null && this.dataList.size() < this.POLLUTANTCOUNT)
        {
            throw new DataFormatException("Array list should contain concentration of 8 pollutants");
        }
    }
}
