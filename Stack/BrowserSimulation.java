import java.util.Stack;

class Browser {
    private Stack<String> backStack;
    private Stack<String> forwardStack;
    private String currentPage;

    public Browser() {
        backStack = new Stack<>();
        forwardStack = new Stack<>();
        currentPage = null;
    }

    public void visit(String url) {
        if (currentPage != null) {
            backStack.push(currentPage);
        }
        currentPage = url;
        forwardStack.clear();
    }

    public String back() {
        if (backStack.isEmpty()) {
            return currentPage;
        }
        forwardStack.push(currentPage);
        currentPage = backStack.pop();
        return currentPage;
    }

    public String forward() {
        if (forwardStack.isEmpty()) {
            return currentPage;
        }
        backStack.push(currentPage);
        currentPage = forwardStack.pop();
        return currentPage;
    }

    public String getCurrentPage() {
        return currentPage;
    }
}

public class BrowserSimulation {
    public static void main(String[] args) {
        Browser browser = new Browser();
        browser.visit("https://www.example1.com");
        browser.visit("https://www.example2.com");
        browser.visit("https://www.example3.com");

        System.out.println("当前页面: " + browser.getCurrentPage());
        System.out.println("后退到: " + browser.back());
        System.out.println("后退到: " + browser.back());
        System.out.println("前进到: " + browser.forward());
    }
}    