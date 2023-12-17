public ReadableObjectId(Object id) { [EOL]     this.id = id; [EOL] } <line_num>: 15,18
public void bindItem(Object ob) throws IOException { [EOL]     if (item != null) { [EOL]         throw new IllegalStateException("Already had POJO for id (" + id.getClass().getName() + ") [" + id + "]"); [EOL]     } [EOL]     item = ob; [EOL] } <line_num>: 24,30
