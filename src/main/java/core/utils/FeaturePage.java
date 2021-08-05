package core.utils;

/**
 * This class of returns link of feature page.
 */
public class FeaturePage {

    public String getstr() {
        return "Hello";
    }

    /**
     * Gets link of feature.
     *
     * @param feature is a name of feature.
     * @return url.
     */
    public static String getFeaturePage(String feature) {
        String url = "https://freeorg2-dev-ed.lightning.force.com/lightning/o/" + feature + "/list?filterName=Recent";
        return url;
    }
}
