package cn.ericmoon.oops4java.pojo;

/**
 * @ProjectName: oops4java
 * @CoderName: Eric Wong
 * @Date: 2018/12/6
 * @Desc: 数据处理结果类封装
 */
public class AnalyResult {

    private Stus AnalyStus;
    private double maxScore;
    private double minScore;
    private double avaScore;

    public Stus getAnalyStus() {
        return AnalyStus;
    }

    public void setAnalyStus(Stus analyStus) {
        AnalyStus = analyStus;
    }

    public double getMaxScore() {
        return maxScore;
    }

    public void setMaxScore(double maxScore) {
        this.maxScore = maxScore;
    }

    public double getMinScore() {
        return minScore;
    }

    public void setMinScore(double minScore) {
        this.minScore = minScore;
    }

    public double getAvaScore() {
        return avaScore;
    }

    public void setAvaScore(double avaScore) {
        this.avaScore = avaScore;
    }

    @Override
    public String toString() {
        return "AnalyResult{" +
                "AnalyStus=" + AnalyStus.getStus().toString() +
                ", maxScore=" + maxScore +
                ", minScore=" + minScore +
                ", avaScore=" + avaScore +
                '}';
    }
}
