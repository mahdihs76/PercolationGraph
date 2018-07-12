import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class PercolationChart extends ApplicationFrame {

    public PercolationChart() {
        super("Percolation");
        JFreeChart lineChart = ChartFactory.createLineChart(
                "Percolation",
                "p", "teta(p)",
                createDataset(),
                PlotOrientation.VERTICAL,
                true, true, false);

        ChartPanel chartPanel = new ChartPanel(lineChart);
        chartPanel.setPreferredSize(new java.awt.Dimension(560, 367));
        setContentPane(chartPanel);
    }

    private DefaultCategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (int n = 10; n < 100; n += 10) {
            for (double p = 0; p <= 1; p += 0.1) {
                double q = PercolationProbability.evaluate(n, p, 10000);
                dataset.addValue(q, toRowKey(n), String.valueOf(p));
            }
        }
        return dataset;
    }

    private String toRowKey(int n) {
        if (n == 10) return "۱۰";
        if (n == 20) return "۲۰";
        if (n == 30) return "۳۰";
        if (n == 40) return "۴۰";
        if (n == 50) return "۵۰";
        if (n == 60) return "۶۰";
        if (n == 70) return "۷۰";
        if (n == 80) return "۸۰";
        if (n == 90) return "۹۰";
        if (n == 100) return "۱۰۰";
        return String.valueOf(n);
    }

}