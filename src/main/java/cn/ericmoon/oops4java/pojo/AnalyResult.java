package cn.ericmoon.oops4java.pojo;

import java.util.List;

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
    private List<Integer> l;
    private List<Double> lb;

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

    public List<Integer> getL() {
        return l;
    }

    public void setL(List<Integer> l) {
        this.l = l;
    }

    public List<Double> getLb() {
        return lb;
    }

    public void setLb(List<Double> lb) {
        this.lb = lb;
    }

    @Override
    public String toString() {
        return "AnalyResult{" +
                "AnalyStus=" + AnalyStus +
                ", maxScore=" + maxScore +
                ", minScore=" + minScore +
                ", avaScore=" + avaScore +
                ", l=" + l +
                ", lb=" + lb +
                '}';
    }
}
