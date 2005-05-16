/* 
 * This file is part of the Echo Web Application Framework (hereinafter "Echo").
 * Copyright (C) 2002-2005 NextApp, Inc.
 *
 * Version: MPL 1.1/GPL 2.0/LGPL 2.1
 *
 * The contents of this file are subject to the Mozilla Public License Version
 * 1.1 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the
 * License.
 *
 * Alternatively, the contents of this file may be used under the terms of
 * either the GNU General Public License Version 2 or later (the "GPL"), or
 * the GNU Lesser General Public License Version 2.1 or later (the "LGPL"),
 * in which case the provisions of the GPL or the LGPL are applicable instead
 * of those above. If you wish to allow use of your version of this file only
 * under the terms of either the GPL or the LGPL, and not to allow others to
 * use your version of this file under the terms of the MPL, indicate your
 * decision by deleting the provisions above and replace them with the notice
 * and other provisions required by the GPL or the LGPL. If you do not delete
 * the provisions above, a recipient may use your version of this file under
 * the terms of any one of the MPL, the GPL or the LGPL.
 */

package nextapp.echo2.testapp.interactive.testscreen;

import nextapp.echo2.app.Color;
import nextapp.echo2.app.Extent;
import nextapp.echo2.app.Font;
import nextapp.echo2.app.Insets;
import nextapp.echo2.app.Label;
import nextapp.echo2.app.SplitPane;
import nextapp.echo2.app.layout.SplitPaneLayoutData;
import nextapp.echo2.testapp.interactive.Styles;

/**
 * 
 */
public class SplitPaneNestedTest extends SplitPane {
    
    private static final Insets INSETS_10 = new Insets(10);
    private static final Color COLOR_A = new Color(0xaf7f7f);
    private static final Color COLOR_B = new Color(0xbf7f7f);
    private static final Color COLOR_C = new Color(0xbf9f7f);
    private static final Color COLOR_D = new Color(0xbfbf7f);
    private static final Color COLOR_E = new Color(0x9fbf7f);
    private static final Color COLOR_F = new Color(0x7fbf7f);
    private static final Color COLOR_G = new Color(0x7fbf9f);
    private static final Color COLOR_H = new Color(0x7fbfbf);
    private static final Color COLOR_I = new Color(0x7f9fbf);
    private static final Font BIG_FONT = new Font(Font.COURIER_NEW, Font.BOLD, new Extent(30));
    
    public SplitPaneNestedTest() {
        super(SplitPane.ORIENTATION_VERTICAL, new Extent(80, Extent.PX));
        setResizable(true);
        setFont(BIG_FONT);
        
        Label label;
        SplitPaneLayoutData splitPaneLayoutData;
        
        splitPaneLayoutData = new SplitPaneLayoutData();
        splitPaneLayoutData.setBackground(COLOR_A);
        splitPaneLayoutData.setBackgroundImage(Styles.BG_NW_SHADOW);
        splitPaneLayoutData.setInsets(INSETS_10);
        label = new Label("A");
        label.setLayoutData(splitPaneLayoutData);
        add(label);
        SplitPane splitPaneAlpha = new SplitPane(SplitPane.ORIENTATION_HORIZONTAL, new Extent(80));
        splitPaneAlpha.setResizable(true);
        add(splitPaneAlpha);
        
        splitPaneLayoutData = new SplitPaneLayoutData();
        splitPaneLayoutData.setBackground(COLOR_B);
        splitPaneLayoutData.setBackgroundImage(Styles.BG_NW_SHADOW);
        splitPaneLayoutData.setInsets(INSETS_10);
        label = new Label("B");
        label.setLayoutData(splitPaneLayoutData);
        splitPaneAlpha.add(label);
        SplitPane splitPaneBravo = new SplitPane(SplitPane.ORIENTATION_VERTICAL, new Extent(-80));
        splitPaneBravo.setResizable(true);
        splitPaneAlpha.add(splitPaneBravo);
        
        splitPaneLayoutData = new SplitPaneLayoutData();
        splitPaneLayoutData.setBackground(COLOR_C);
        splitPaneLayoutData.setBackgroundImage(Styles.BG_NW_SHADOW);
        splitPaneLayoutData.setInsets(INSETS_10);
        label = new Label("C");
        label.setLayoutData(splitPaneLayoutData);
        SplitPane splitPaneCharlie = new SplitPane(SplitPane.ORIENTATION_HORIZONTAL, new Extent(-80));
        splitPaneCharlie.setResizable(true);
        splitPaneBravo.add(splitPaneCharlie);
        splitPaneBravo.add(label);
        
        splitPaneLayoutData = new SplitPaneLayoutData();
        splitPaneLayoutData.setBackground(COLOR_D);
        splitPaneLayoutData.setBackgroundImage(Styles.BG_NW_SHADOW);
        splitPaneLayoutData.setInsets(INSETS_10);
        label = new Label("D");
        label.setLayoutData(splitPaneLayoutData);
        SplitPane splitPaneDelta = new SplitPane(SplitPane.ORIENTATION_VERTICAL, new Extent(80));
        splitPaneDelta.setResizable(true);
        splitPaneCharlie.add(splitPaneDelta);
        splitPaneCharlie.add(label);
        
        splitPaneLayoutData = new SplitPaneLayoutData();
        splitPaneLayoutData.setBackground(COLOR_E);
        splitPaneLayoutData.setBackgroundImage(Styles.BG_NW_SHADOW);
        splitPaneLayoutData.setInsets(INSETS_10);
        label = new Label("E");
        label.setLayoutData(splitPaneLayoutData);
        splitPaneDelta.add(label);
        SplitPane splitPaneEcho = new SplitPane(SplitPane.ORIENTATION_HORIZONTAL, new Extent(80));
        splitPaneEcho.setResizable(true);
        splitPaneDelta.add(splitPaneEcho);

        splitPaneLayoutData = new SplitPaneLayoutData();
        splitPaneLayoutData.setBackground(COLOR_F);
        splitPaneLayoutData.setBackgroundImage(Styles.BG_NW_SHADOW);
        splitPaneLayoutData.setInsets(INSETS_10);
        label = new Label("F");
        label.setLayoutData(splitPaneLayoutData);
        splitPaneEcho.add(label);
        SplitPane splitPaneFoxtrot = new SplitPane(SplitPane.ORIENTATION_VERTICAL, new Extent(-80));
        splitPaneFoxtrot.setResizable(true);
        splitPaneEcho.add(splitPaneFoxtrot);

        splitPaneLayoutData = new SplitPaneLayoutData();
        splitPaneLayoutData.setBackground(COLOR_G);
        splitPaneLayoutData.setBackgroundImage(Styles.BG_NW_SHADOW);
        splitPaneLayoutData.setInsets(INSETS_10);
        label = new Label("G");
        label.setLayoutData(splitPaneLayoutData);
        SplitPane splitPaneGolf = new SplitPane(SplitPane.ORIENTATION_HORIZONTAL, new Extent(-80));
        splitPaneGolf.setResizable(true);
        splitPaneFoxtrot.add(splitPaneGolf);
        splitPaneFoxtrot.add(label);

        splitPaneLayoutData = new SplitPaneLayoutData();
        splitPaneLayoutData.setBackground(COLOR_I);
        splitPaneLayoutData.setBackgroundImage(Styles.BG_NW_SHADOW);
        splitPaneLayoutData.setInsets(INSETS_10);
        label = new Label("I");
        label.setLayoutData(splitPaneLayoutData);
        splitPaneGolf.add(label);
        splitPaneLayoutData = new SplitPaneLayoutData();
        splitPaneLayoutData.setBackground(COLOR_H);
        splitPaneLayoutData.setBackgroundImage(Styles.BG_NW_SHADOW);
        splitPaneLayoutData.setInsets(INSETS_10);
        label = new Label("H");
        label.setLayoutData(splitPaneLayoutData);
        splitPaneGolf.add(label);
    }
}
