public Single(Class<?> v) { [EOL]     _view = v; [EOL] } <line_num>: 49,49
public Multi(Class<?>[] v) { [EOL]     _views = v; [EOL] } <line_num>: 63,63
public abstract boolean isVisibleForView(Class<?> activeView); <line_num>: 9,9
public static ViewMatcher construct(Class<?>[] views) { [EOL]     if (views == null) { [EOL]         return Empty.instance; [EOL]     } [EOL]     switch(views.length) { [EOL]         case 0: [EOL]             return Empty.instance; [EOL]         case 1: [EOL]             return new Single(views[0]); [EOL]     } [EOL]     return new Multi(views); [EOL] } <line_num>: 11,23
@Override [EOL] public boolean isVisibleForView(Class<?> activeView) { [EOL]     return false; [EOL] } <line_num>: 37,40
@Override [EOL] public boolean isVisibleForView(Class<?> activeView) { [EOL]     return (activeView == _view) || _view.isAssignableFrom(activeView); [EOL] } <line_num>: 50,53
@Override [EOL] public boolean isVisibleForView(Class<?> activeView) { [EOL]     for (int i = 0, len = _views.length; i < len; ++i) { [EOL]         Class<?> view = _views[i]; [EOL]         if ((activeView == view) || view.isAssignableFrom(activeView)) { [EOL]             return true; [EOL]         } [EOL]     } [EOL]     return false; [EOL] } <line_num>: 65,75
