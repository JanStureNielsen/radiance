package org.pushingpixels.demo.flamingo.svg.filetypes.transcoded;

import java.awt.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.lang.ref.WeakReference;
import java.util.Base64;
import javax.imageio.ImageIO;
import javax.swing.plaf.UIResource;

import org.pushingpixels.neon.api.icon.ResizableIcon;
import org.pushingpixels.neon.api.icon.ResizableIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_aifc implements ResizableIcon {
    

    @SuppressWarnings("unused")
	private void innerPaint(Graphics2D g) {
        Shape shape = null;
        Paint paint = null;
        Stroke stroke = null;
        Shape clip = null;

        float origAlpha = 1.0f;
        Composite origComposite = g.getComposite();
        if (origComposite instanceof AlphaComposite) {
            AlphaComposite origAlphaComposite = 
                (AlphaComposite)origComposite;
            if (origAlphaComposite.getRule() == AlphaComposite.SRC_OVER) {
                origAlpha = origAlphaComposite.getAlpha();
            }
        }
        
	    AffineTransform defaultTransform_ = g.getTransform();
// 
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0 = g.getTransform();
g.transform(new AffineTransform(0.009999999776482582f, 0.0f, 0.0f, 0.009999999776482582f, 0.13999999687075615f, -0.0f));
// _0
g.setComposite(AlphaComposite.getInstance(3, 0.99f * origAlpha));
AffineTransform defaultTransform__0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 0.9);
((GeneralPath)shape).lineTo(72.3, 27.699999);
((GeneralPath)shape).lineTo(72.3, 99.1);
((GeneralPath)shape).lineTo(0.0, 99.1);
((GeneralPath)shape).lineTo(0.0, 0.9);
((GeneralPath)shape).lineTo(45.2, 0.9);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(36.150001525878906, 2.88700008392334), new Point2D.Double(36.150001525878906, 101.1259994506836), new float[] {0.0f,0.012f,0.182f,0.352f,0.521f,0.687f,0.848f,1.0f}, new Color[] {new Color(89, 85, 147, 255),new Color(91, 87, 148, 255),new Color(123, 119, 170, 255),new Color(152, 150, 191, 255),new Color(178, 178, 210, 255),new Color(199, 201, 226, 255),new Color(214, 217, 236, 255),new Color(219, 223, 240, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 0.9);
((GeneralPath)shape).lineTo(72.3, 27.699999);
((GeneralPath)shape).lineTo(72.3, 99.1);
((GeneralPath)shape).lineTo(0.0, 99.1);
((GeneralPath)shape).lineTo(0.0, 0.9);
((GeneralPath)shape).lineTo(45.2, 0.9);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(45, 50, 147, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 0.9);
((GeneralPath)shape).lineTo(72.3, 27.699999);
((GeneralPath)shape).lineTo(72.3, 99.1);
((GeneralPath)shape).lineTo(0.0, 99.1);
((GeneralPath)shape).lineTo(0.0, 0.9);
((GeneralPath)shape).lineTo(45.2, 0.9);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_1);
g.setTransform(defaultTransform__0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
shape = new GeneralPath();
((GeneralPath)shape).moveTo(23.7, 91.2);
((GeneralPath)shape).lineTo(19.300001, 91.2);
((GeneralPath)shape).lineTo(17.500002, 86.7);
((GeneralPath)shape).lineTo(9.500002, 86.7);
((GeneralPath)shape).lineTo(7.800002, 91.2);
((GeneralPath)shape).lineTo(3.5, 91.2);
((GeneralPath)shape).lineTo(11.3, 71.299995);
((GeneralPath)shape).lineTo(15.6, 71.299995);
((GeneralPath)shape).lineTo(23.7, 91.2);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(16.2, 83.299995);
((GeneralPath)shape).lineTo(13.400001, 75.899994);
((GeneralPath)shape).lineTo(10.700001, 83.299995);
((GeneralPath)shape).lineTo(16.2, 83.299995);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(25.800001, 91.2);
((GeneralPath)shape).lineTo(25.800001, 71.3);
((GeneralPath)shape).lineTo(29.900002, 71.3);
((GeneralPath)shape).lineTo(29.900002, 91.200005);
((GeneralPath)shape).lineTo(25.800001, 91.200005);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(33.7, 91.2);
((GeneralPath)shape).lineTo(33.7, 71.3);
((GeneralPath)shape).lineTo(47.5, 71.3);
((GeneralPath)shape).lineTo(47.5, 74.700005);
((GeneralPath)shape).lineTo(37.8, 74.700005);
((GeneralPath)shape).lineTo(37.8, 79.4);
((GeneralPath)shape).lineTo(46.199997, 79.4);
((GeneralPath)shape).lineTo(46.199997, 82.8);
((GeneralPath)shape).lineTo(37.799995, 82.8);
((GeneralPath)shape).lineTo(37.799995, 91.3);
((GeneralPath)shape).lineTo(33.699997, 91.3);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(63.7, 83.899994);
((GeneralPath)shape).lineTo(67.6, 85.09999);
((GeneralPath)shape).curveTo(67.0, 87.29999, 66.0, 88.899994, 64.6, 89.899994);
((GeneralPath)shape).curveTo(63.199997, 90.899994, 61.399998, 91.49999, 59.3, 91.49999);
((GeneralPath)shape).curveTo(56.6, 91.49999, 54.399998, 90.59999, 52.7, 88.799995);
((GeneralPath)shape).curveTo(51.0, 86.99999, 50.100002, 84.49999, 50.100002, 81.399994);
((GeneralPath)shape).curveTo(50.100002, 78.09999, 51.000004, 75.49999, 52.7, 73.7);
((GeneralPath)shape).curveTo(54.4, 71.899994, 56.7, 71.0, 59.5, 71.0);
((GeneralPath)shape).curveTo(62.0, 71.0, 64.0, 71.7, 65.5, 73.2);
((GeneralPath)shape).curveTo(66.4, 74.1, 67.1, 75.299995, 67.6, 76.899994);
((GeneralPath)shape).lineTo(63.6, 77.899994);
((GeneralPath)shape).curveTo(63.399998, 76.899994, 62.899998, 76.09999, 62.1, 75.49999);
((GeneralPath)shape).curveTo(61.3, 74.899994, 60.399998, 74.59999, 59.3, 74.59999);
((GeneralPath)shape).curveTo(57.8, 74.59999, 56.6, 75.09999, 55.7, 76.19999);
((GeneralPath)shape).curveTo(54.8, 77.29999, 54.3, 78.99999, 54.3, 81.29999);
((GeneralPath)shape).curveTo(54.3, 83.79999, 54.8, 85.59999, 55.7, 86.69999);
((GeneralPath)shape).curveTo(56.600002, 87.79999, 57.8, 88.29999, 59.3, 88.29999);
((GeneralPath)shape).curveTo(60.399998, 88.29999, 61.3, 87.999985, 62.1, 87.29999);
((GeneralPath)shape).curveTo(62.8, 86.39999, 63.399998, 85.29999, 63.699997, 83.89999);
((GeneralPath)shape).closePath();
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_1);
g.setComposite(AlphaComposite.getInstance(3, 0.99f * origAlpha));
AffineTransform defaultTransform__0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 0.9);
((GeneralPath)shape).lineTo(72.3, 27.699999);
((GeneralPath)shape).lineTo(45.2, 27.699999);
((GeneralPath)shape).lineTo(45.2, 0.9);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(58.32099914550781, 87.27300262451172), new Point2D.Double(50.78300094604492, 78.83899688720703), new float[] {0.0f,0.07f,0.159f,0.255f,0.359f,0.471f,0.598f,0.751f,1.0f}, new Color[] {new Color(89, 85, 147, 255),new Color(112, 108, 162, 255),new Color(137, 136, 181, 255),new Color(163, 165, 200, 255),new Color(186, 191, 217, 255),new Color(206, 213, 231, 255),new Color(222, 230, 242, 255),new Color(233, 243, 250, 255),new Color(236, 248, 254, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 0.9);
((GeneralPath)shape).lineTo(72.3, 27.699999);
((GeneralPath)shape).lineTo(45.2, 27.699999);
((GeneralPath)shape).lineTo(45.2, 0.9);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(45, 50, 147, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 0.9);
((GeneralPath)shape).lineTo(72.3, 27.699999);
((GeneralPath)shape).lineTo(45.2, 27.699999);
((GeneralPath)shape).lineTo(45.2, 0.9);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_2_1);
g.setTransform(defaultTransform__0_2);
g.setComposite(AlphaComposite.getInstance(3, 0.99f * origAlpha));
AffineTransform defaultTransform__0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
shape = new GeneralPath();
((GeneralPath)shape).moveTo(14.8, 39.3);
((GeneralPath)shape).lineTo(21.3, 39.3);
((GeneralPath)shape).lineTo(34.3, 29.3);
((GeneralPath)shape).lineTo(34.3, 62.3);
((GeneralPath)shape).lineTo(21.3, 52.3);
((GeneralPath)shape).lineTo(14.799999, 52.3);
((GeneralPath)shape).lineTo(14.799999, 39.3);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(40.9, 49.5);
((GeneralPath)shape).lineTo(40.9, 52.4);
((GeneralPath)shape).curveTo(41.0, 52.4, 42.5, 52.4, 44.100002, 51.600002);
((GeneralPath)shape).curveTo(45.700005, 50.800003, 47.500004, 48.9, 47.500004, 45.800003);
((GeneralPath)shape).curveTo(47.500004, 42.700005, 45.800003, 40.800003, 44.100002, 40.000004);
((GeneralPath)shape).curveTo(42.500004, 39.200005, 41.000004, 39.200005, 40.9, 39.200005);
((GeneralPath)shape).lineTo(40.9, 42.100006);
((GeneralPath)shape).lineTo(41.0, 42.100006);
((GeneralPath)shape).curveTo(41.4, 42.100006, 42.4, 42.300007, 43.1, 42.800007);
((GeneralPath)shape).curveTo(43.899998, 43.300007, 44.5, 44.000008, 44.5, 45.800007);
((GeneralPath)shape).curveTo(44.5, 47.800007, 43.7, 48.400005, 42.7, 49.000008);
((GeneralPath)shape).curveTo(42.2, 49.20001, 41.7, 49.40001, 41.4, 49.40001);
((GeneralPath)shape).curveTo(41.2, 49.40001, 41.100002, 49.40001, 41.0, 49.500008);
((GeneralPath)shape).lineTo(40.9, 49.500008);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(40.9, 54.6);
((GeneralPath)shape).lineTo(40.9, 57.5);
((GeneralPath)shape).curveTo(41.0, 57.5, 43.7, 57.5, 46.7, 56.1);
((GeneralPath)shape).curveTo(49.600002, 54.699997, 52.7, 51.5, 52.600002, 46.0);
((GeneralPath)shape).curveTo(52.7, 40.4, 49.600002, 37.3, 46.7, 35.9);
((GeneralPath)shape).curveTo(43.8, 34.5, 41.100002, 34.5, 40.9, 34.5);
((GeneralPath)shape).lineTo(40.9, 37.4);
((GeneralPath)shape).lineTo(41.2, 37.4);
((GeneralPath)shape).curveTo(42.0, 37.5, 44.3, 37.800003, 46.100002, 39.0);
((GeneralPath)shape).curveTo(48.000004, 40.2, 49.600002, 42.1, 49.600002, 46.1);
((GeneralPath)shape).curveTo(49.600002, 50.699997, 47.500004, 52.6, 45.300003, 53.6);
((GeneralPath)shape).curveTo(44.200005, 54.199997, 43.100002, 54.399998, 42.200005, 54.6);
((GeneralPath)shape).curveTo(41.800003, 54.699997, 41.400005, 54.699997, 41.200005, 54.699997);
((GeneralPath)shape).curveTo(41.000004, 54.6, 40.900005, 54.6, 40.900005, 54.6);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(40.9, 59.6);
((GeneralPath)shape).lineTo(40.9, 62.5);
((GeneralPath)shape).curveTo(41.0, 62.5, 45.0, 62.5, 49.2, 60.4);
((GeneralPath)shape).curveTo(53.4, 58.4, 57.7, 53.9, 57.7, 45.800003);
((GeneralPath)shape).curveTo(57.8, 37.700005, 53.4, 33.200005, 49.2, 31.200003);
((GeneralPath)shape).curveTo(45.0, 29.100002, 41.0, 29.100002, 40.9, 29.100002);
((GeneralPath)shape).lineTo(40.9, 32.0);
((GeneralPath)shape).lineTo(41.5, 32.0);
((GeneralPath)shape).curveTo(42.8, 32.1, 46.3, 32.6, 49.2, 34.5);
((GeneralPath)shape).curveTo(52.100002, 36.4, 54.7, 39.6, 54.8, 45.8);
((GeneralPath)shape).curveTo(54.7, 52.8, 51.399998, 56.0, 47.899998, 57.8);
((GeneralPath)shape).curveTo(46.199997, 58.7, 44.399998, 59.1, 42.999996, 59.3);
((GeneralPath)shape).curveTo(42.299995, 59.399998, 41.799995, 59.5, 41.399998, 59.5);
((GeneralPath)shape).curveTo(41.1, 59.6, 40.899998, 59.6, 40.899998, 59.6);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(14.776000022888184, 56.17399978637695), new Point2D.Double(57.72600173950195, 56.17399978637695), new float[] {0.0f,0.074f,0.266f,0.457f,0.645f,0.827f,1.0f}, new Color[] {new Color(53, 44, 127, 255),new Color(62, 55, 134, 255),new Color(84, 79, 150, 255),new Color(103, 99, 165, 255),new Color(117, 114, 177, 255),new Color(126, 124, 186, 255),new Color(129, 128, 189, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_3);
g.setTransform(defaultTransform__0);
g.setTransform(defaultTransform_);

	}

    /**
     * Returns the X of the bounding box of the original SVG image.
     * 
     * @return The X of the bounding box of the original SVG image.
     */
    public static double getOrigX() {
        return 0.12999999523162842;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 0.0;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 0.7430000305175781;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 1.0;
	}

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ext_aifc() {
        this.width = (int) getOrigWidth();
        this.height = (int) getOrigHeight();
	}

    @Override
	public int getIconHeight() {
		return height;
	}

    @Override
	public int getIconWidth() {
		return width;
	}

	@Override
	public void setDimension(Dimension newDimension) {
		this.width = newDimension.width;
		this.height = newDimension.height;
	}

    @Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		Graphics2D g2d = (Graphics2D) g.create();
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BICUBIC);
		g2d.translate(x, y);

        double coef1 = (double) this.width / getOrigWidth();
        double coef2 = (double) this.height / getOrigHeight();
        double coef = Math.min(coef1, coef2);
        g2d.clipRect(0, 0, this.width, this.height);
        g2d.scale(coef, coef);
        g2d.translate(-getOrigX(), -getOrigY());
        if (coef1 != coef2) {
            if (coef1 < coef2) {
               int extraDy = (int) ((getOrigWidth() - getOrigHeight()) / 2.0);
               g2d.translate(0, extraDy);
            } else {
               int extraDx = (int) ((getOrigHeight() - getOrigWidth()) / 2.0);
               g2d.translate(extraDx, 0);
            }
        }
        Graphics2D g2ForInner = (Graphics2D) g2d.create();
        innerPaint(g2ForInner);
        g2ForInner.dispose();
        g2d.dispose();
	}
    
    /**
     * Returns a new instance of this icon with specified dimensions.
     *
     * @param width Required width of the icon
     * @param height Required height of the icon
     * @return A new instance of this icon with specified dimensions.
     */
    public static ResizableIcon of(int width, int height) {
       ext_aifc base = new ext_aifc();
       base.width = width;
       base.height = height;
       return base;
    }

    /**
     * Returns a new {@link UIResource} instance of this icon with specified dimensions.
     *
     * @param width Required width of the icon
     * @param height Required height of the icon
     * @return A new {@link UIResource} instance of this icon with specified dimensions.
     */
    public static ResizableIconUIResource uiResourceOf(int width, int height) {
       ext_aifc base = new ext_aifc();
       base.width = width;
       base.height = height;
       return new ResizableIconUIResource(base);
    }

    /**
     * Returns a factory that returns instances of this icon on demand.
     *
     * @return Factory that returns instances of this icon on demand.
     */
    public static Factory factory() {
        return ext_aifc::new;
    }
}

