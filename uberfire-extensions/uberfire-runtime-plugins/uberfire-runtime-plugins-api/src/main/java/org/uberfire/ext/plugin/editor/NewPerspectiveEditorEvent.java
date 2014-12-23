package org.uberfire.ext.plugin.editor;

import org.jboss.errai.common.client.api.annotations.Portable;

@Portable
public class NewPerspectiveEditorEvent {

    private PerspectiveEditor perspectiveContent;

    public NewPerspectiveEditorEvent(){

    }

    public NewPerspectiveEditorEvent( PerspectiveEditor perspectiveContent ) {

        this.perspectiveContent = perspectiveContent;
    }

    public PerspectiveEditor getPerspectiveContent() {
        return perspectiveContent;
    }
}
