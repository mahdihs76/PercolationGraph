import org.jfree.ui.RefineryUtilities;

/**
 * Created by mahdihs76 on 7/13/18.
 */
public class Main {
    public static void main(String[] args) {
        PercolationChart chart = new PercolationChart();

        chart.pack( );
        RefineryUtilities.centerFrameOnScreen( chart );
        chart.setVisible(true);
    }
}
