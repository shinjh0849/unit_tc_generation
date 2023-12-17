public Version version()
public Version version()
long serialVersionUID=Optional[1L]
NopAnnotationIntrospector instance=Optional[new NopAnnotationIntrospector() {

    private static final long serialVersionUID = 1L;

    @Override
    public Version version() {
        return com.fasterxml.jackson.databind.cfg.PackageVersion.VERSION;
    }
}]
