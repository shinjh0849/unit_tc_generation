protected NameTransformer()
public Chained(NameTransformer t1, NameTransformer t2)
public String transform(String name)
public String reverse(String transformed)
public String transform(String name)
public String reverse(String transformed)
public String toString()
public String transform(String name)
public String reverse(String transformed)
public String toString()
public String transform(String name)
public String reverse(String transformed)
public String toString()
public static NameTransformer simpleTransformer(final String prefix, final String suffix)
public static NameTransformer chainedTransformer(NameTransformer t1, NameTransformer t2)
public abstract String transform(String name)
public abstract String reverse(String transformed)
public String transform(String name)
public String reverse(String transformed)
public String toString()
NameTransformer NOP=Optional[new NameTransformer() {

    @Override
    public String transform(String name) {
        return name;
    }

    @Override
    public String reverse(String transformed) {
        // identity transformation is always reversible:
        return transformed;
    }
}]
