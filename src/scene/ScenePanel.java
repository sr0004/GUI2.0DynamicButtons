
package scene;


/**
 *
 * @author MSB_C207
 */
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import javax.swing.JPanel;

public class ScenePanel extends JPanel {

    private static class Layout implements LayoutManager {
        @Override
        public void addLayoutComponent(String name, Component child) {
            if (name != null) {
                child.setName(name);
            }
            child.setVisible(child.getParent().getComponentCount() == 1);
        }

        /**
         * If this child was visible, then make the first remaining child
         * visible.
         */
        
        @Override
        public void removeLayoutComponent(Component child) {
            if (child.isVisible()) {
                Container parent = child.getParent();
                if (parent.getComponentCount() > 0) {
                    parent.getComponent(0).setVisible(true);
                }
            }
        }

        /**
         * @return the maximum preferred width/height + the parents insets
         */
        public Dimension preferredLayoutSize(Container parent) {
            int nChildren = parent.getComponentCount();
            Insets insets = parent.getInsets();
            int width = insets.left + insets.right;
            int height = insets.top + insets.bottom;

            for (int i = 0; i < nChildren; i++) {
                Dimension d = parent.getComponent(i).getPreferredSize();
                if (d.width > width) {
                    width = d.width;
                }
                if (d.height > height) {
                    height = d.height;
                }
            }
            return new Dimension(width, height);
        }

        /**
         * @return the maximum minimum width/height + the parents insets
         */
        public Dimension minimumLayoutSize(Container parent) {
            int nChildren = parent.getComponentCount();
            Insets insets = parent.getInsets();
            int width = insets.left + insets.right;
            int height = insets.top + insets.bottom;

            for (int i = 0; i < nChildren; i++) {
                Dimension d = parent.getComponent(i).getMinimumSize();
                if (d.width > width) {
                    width = d.width;
                }
                if (d.height > height) {
                    height = d.height;
                }
            }
            return new Dimension(width, height);
        }

        public void layoutContainer(Container parent) {
            int nChildren = parent.getComponentCount();
            Insets insets = parent.getInsets();
            for (int i = 0; i < nChildren; i++) {
                Component child = parent.getComponent(i);
                if (child.isVisible()) {
                    Rectangle r = parent.getBounds();
                    int width = r.width - insets.left + insets.right;
                    int height = r.height - insets.top + insets.bottom;
                    child.setBounds(insets.left, insets.top, width, height);
                    break;
                }
            }
        }
    }

    /**
     * Creates a CardPanel. Children, called "cards" in this API, should be
     * added with add(). The first child we be made visible, subsequent children
     * will be hidden. To show a card, use one of the show*Card methods.
     */
    public ScenePanel() {
        super(new Layout());
    }

    /**
     * Return the index of the first (and one would hope - only) visible child.
     * If a visible child can't be found, perhaps the caller has inexlicably
     * hidden all of the children, then return -1.
     */
    private int getVisibleChildIndex() {
        int nChildren = getComponentCount();
        for (int i = 0; i < nChildren; i++) {
            Component child = getComponent(i);
            if (child.isVisible()) {
                return i;
            }
        }
        return -1;
    }

    public String getVisibleChildName() {
        int nChildren = getComponentCount();
        for (int i = 0; i < nChildren; i++) {
            Component child = getComponent(i);
            if (child.isVisible()) {
                return child.getName();
            }
        }
        return "None";
    }

    public int getVisibleChildNumber() {
        return getVisibleChildIndex();
    }

    /**
     * Hide the currently visible child "card" and show the specified card. If
     * the specified card isn't a child of the CardPanel then we add it here.
     */
    public void showScene(Component scene) {
        if (scene.getParent() != this) {
            add(scene);
        }
        int index = getVisibleChildIndex();
        if (index != -1) {
            getComponent(index).setVisible(false);
        }
        scene.setVisible(true);
        revalidate();
        repaint();
    }

    /**
     * Show the card with the specified name.
     *
     * @see java.awt.Component#getName
     */
    public void showScene(String name) {
        int nChildren = getComponentCount();
        for (int i = 0; i < nChildren; i++) {
            Component child = getComponent(i);
            if (child.getName().equals(name)) {
                showScene(child);
                break;
            }
        }
    }

    /**
     * Show the card that was added to this CardPanel after the currently
     * visible card. If the currently visible card was added last, then show the
     * first card.
     */
    public void showNextScene() {
        if (getComponentCount() <= 0) {
            return;
        }
        int index = getVisibleChildIndex();
        if (index == -1) {
            showScene(getComponent(0));
        } else if (index == (getComponentCount() - 1)) {
            showScene(getComponent(0));
        } else {
            showScene(getComponent(index + 1));
        }
    }

    /**
     * Show the card that was added to this CardPanel before the currently
     * visible card. If the currently visible card was added first, then show
     * the last card.
     */
    public void showPreviousScene() {
        if (getComponentCount() <= 0) {
            return;
        }
        int index = getVisibleChildIndex();
        if (index == -1) {
            showScene(getComponent(0));
        } else if (index == 0) {
            showScene(getComponent(getComponentCount() - 1));
        } else {
            showScene(getComponent(index - 1));
        }
    }

    /**
     * Show the first card that was added to this CardPanel.
     */
    public void showFirstScene() {
        if (getComponentCount() <= 0) {
            return;
        }
        showScene(getComponent(0));
    }

    /**
     * Show the last card that was added to this CardPanel.
     */
    public void showLastScene() {
        if (getComponentCount() <= 0) {
            return;
        }
        showScene(getComponent(getComponentCount() - 1));
    }
}