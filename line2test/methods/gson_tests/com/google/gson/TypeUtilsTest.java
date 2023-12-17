public void testGetActualTypeForFirstTypeVariable() { [EOL]     assertEquals(String.class, TypeUtils.getActualTypeForFirstTypeVariable(MAP_TYPE)); [EOL] } <line_num>: 35,37
public void testIsArrayForNonArrayClasses() { [EOL]     assertFalse(TypeUtils.isArray(Boolean.class)); [EOL]     assertFalse(TypeUtils.isArray(MAP_TYPE)); [EOL] } <line_num>: 39,42
public void testIsArrayForArrayClasses() { [EOL]     assertTrue(TypeUtils.isArray(String[].class)); [EOL]     assertTrue(TypeUtils.isArray(Integer[][].class)); [EOL]     assertTrue(TypeUtils.isArray(Collection[].class)); [EOL] } <line_num>: 44,48
public void testToRawClassForNonGenericClasses() { [EOL]     assertEquals(String.class, TypeUtils.toRawClass(String.class)); [EOL] } <line_num>: 50,52
public void testToRawClassForGenericClasses() { [EOL]     assertEquals(Map.class, TypeUtils.toRawClass(MAP_TYPE)); [EOL] } <line_num>: 54,56
