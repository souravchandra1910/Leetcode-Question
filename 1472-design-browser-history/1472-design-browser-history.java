class BrowserHistory {
    ArrayList<String> tabs;
    int currTab = 0;
    int totalTabs = 0; 

    public BrowserHistory(String homepage) {
        tabs = new ArrayList<>();
        tabs.add(homepage);
        currTab++;
        totalTabs++;
    }

    public void visit(String url) {
        // If we have some URLs after curr Tab
        if (currTab < tabs.size()) tabs.set(currTab, url); else tabs.add(url);
        currTab++;
        totalTabs = currTab;
    }

    public String back(int steps) {
        currTab = Math.max(1, currTab - steps);
        return tabs.get(currTab - 1);
    }

    public String forward(int steps) {
        currTab = Math.min(totalTabs, currTab + steps);
        return tabs.get(currTab - 1);
    }
}
/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
