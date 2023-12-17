public RendererState(PlotRenderingInfo info) { [EOL]     this.info = info; [EOL] } <line_num>: 62,64
public PlotRenderingInfo getInfo() { [EOL]     return this.info; [EOL] } <line_num>: 71,73
public EntityCollection getEntityCollection() { [EOL]     EntityCollection result = null; [EOL]     if (this.info != null) { [EOL]         ChartRenderingInfo owner = this.info.getOwner(); [EOL]         if (owner != null) { [EOL]             result = owner.getEntityCollection(); [EOL]         } [EOL]     } [EOL]     return result; [EOL] } <line_num>: 82,91
