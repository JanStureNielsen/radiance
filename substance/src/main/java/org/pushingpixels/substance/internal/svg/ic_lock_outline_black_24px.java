package org.pushingpixels.substance.internal.svg;

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
public class ic_lock_outline_black_24px implements ResizableIcon {
    

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
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -0.0f, -0.0f));
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0
shape = new GeneralPath();
((GeneralPath)shape).moveTo(12.0, 17.0);
((GeneralPath)shape).curveTo(13.1, 17.0, 14.0, 16.1, 14.0, 15.0);
((GeneralPath)shape).curveTo(14.0, 13.9, 13.1, 13.0, 12.0, 13.0);
((GeneralPath)shape).curveTo(10.9, 13.0, 10.0, 13.9, 10.0, 15.0);
((GeneralPath)shape).curveTo(10.0, 16.1, 10.9, 17.0, 12.0, 17.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(18.0, 8.0);
((GeneralPath)shape).lineTo(17.0, 8.0);
((GeneralPath)shape).lineTo(17.0, 6.0);
((GeneralPath)shape).curveTo(17.0, 3.24, 14.76, 1.0, 12.0, 1.0);
((GeneralPath)shape).curveTo(9.24, 1.0, 7.0, 3.24, 7.0, 6.0);
((GeneralPath)shape).lineTo(7.0, 8.0);
((GeneralPath)shape).lineTo(6.0, 8.0);
((GeneralPath)shape).curveTo(4.9, 8.0, 4.0, 8.9, 4.0, 10.0);
((GeneralPath)shape).lineTo(4.0, 20.0);
((GeneralPath)shape).curveTo(4.0, 21.1, 4.9, 22.0, 6.0, 22.0);
((GeneralPath)shape).lineTo(18.0, 22.0);
((GeneralPath)shape).curveTo(19.1, 22.0, 20.0, 21.1, 20.0, 20.0);
((GeneralPath)shape).lineTo(20.0, 10.0);
((GeneralPath)shape).curveTo(20.0, 8.9, 19.1, 8.0, 18.0, 8.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(8.9, 6.0);
((GeneralPath)shape).curveTo(8.9, 4.29, 10.29, 2.9, 12.0, 2.9);
((GeneralPath)shape).curveTo(13.71, 2.9, 15.1, 4.29, 15.1, 6.0);
((GeneralPath)shape).lineTo(15.1, 8.0);
((GeneralPath)shape).lineTo(8.9, 8.0);
((GeneralPath)shape).lineTo(8.9, 6.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(18.0, 20.0);
((GeneralPath)shape).lineTo(6.0, 20.0);
((GeneralPath)shape).lineTo(6.0, 10.0);
((GeneralPath)shape).lineTo(18.0, 10.0);
((GeneralPath)shape).lineTo(18.0, 20.0);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0);
g.setTransform(defaultTransform__0);
g.setTransform(defaultTransform_);

	}

    /**
     * Returns the X of the bounding box of the original SVG image.
     * 
     * @return The X of the bounding box of the original SVG image.
     */
    public static double getOrigX() {
        return 4.0;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 1.0;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 16.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 21.0;
	}

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ic_lock_outline_black_24px() {
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
       ic_lock_outline_black_24px base = new ic_lock_outline_black_24px();
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
       ic_lock_outline_black_24px base = new ic_lock_outline_black_24px();
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
        return ic_lock_outline_black_24px::new;
    }
}

