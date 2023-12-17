public RendererChangeEvent(Object renderer) { [EOL]     this(renderer, false); [EOL] } <line_num>: 69,71
public RendererChangeEvent(Object renderer, boolean seriesVisibilityChanged) { [EOL]     super(renderer); [EOL]     this.renderer = renderer; [EOL]     this.seriesVisibilityChanged = seriesVisibilityChanged; [EOL] } <line_num>: 80,85
public Object getRenderer() { [EOL]     return this.renderer; [EOL] } <line_num>: 92,94
public boolean getSeriesVisibilityChanged() { [EOL]     return this.seriesVisibilityChanged; [EOL] } <line_num>: 104,106
