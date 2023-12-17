public CategoryLabelPositions()
public CategoryLabelPositions(CategoryLabelPosition top, CategoryLabelPosition bottom, CategoryLabelPosition left, CategoryLabelPosition right)
public static CategoryLabelPositions createUpRotationLabelPositions(double angle)
public static CategoryLabelPositions createDownRotationLabelPositions(double angle)
public CategoryLabelPosition getLabelPosition(RectangleEdge edge)
public static CategoryLabelPositions replaceTopPosition(CategoryLabelPositions base, CategoryLabelPosition top)
public static CategoryLabelPositions replaceBottomPosition(CategoryLabelPositions base, CategoryLabelPosition bottom)
public static CategoryLabelPositions replaceLeftPosition(CategoryLabelPositions base, CategoryLabelPosition left)
public static CategoryLabelPositions replaceRightPosition(CategoryLabelPositions base, CategoryLabelPosition right)
public boolean equals(Object obj)
public int hashCode()
long serialVersionUID=Optional[-8999557901920364580L]
CategoryLabelPositions STANDARD=Optional[new CategoryLabelPositions(new CategoryLabelPosition(RectangleAnchor.BOTTOM, TextBlockAnchor.BOTTOM_CENTER), // TOP
new CategoryLabelPosition(RectangleAnchor.TOP, TextBlockAnchor.TOP_CENTER), // BOTTOM
new CategoryLabelPosition(RectangleAnchor.RIGHT, TextBlockAnchor.CENTER_RIGHT, CategoryLabelWidthType.RANGE, 0.30f), // LEFT
new CategoryLabelPosition(RectangleAnchor.LEFT, TextBlockAnchor.CENTER_LEFT, CategoryLabelWidthType.RANGE, 0.30f))]
CategoryLabelPositions UP_90=Optional[new CategoryLabelPositions(new CategoryLabelPosition(RectangleAnchor.BOTTOM, TextBlockAnchor.CENTER_LEFT, TextAnchor.CENTER_LEFT, -Math.PI / 2.0, CategoryLabelWidthType.RANGE, 0.30f), // TOP
new CategoryLabelPosition(RectangleAnchor.TOP, TextBlockAnchor.CENTER_RIGHT, TextAnchor.CENTER_RIGHT, -Math.PI / 2.0, CategoryLabelWidthType.RANGE, 0.30f), // BOTTOM
new CategoryLabelPosition(RectangleAnchor.RIGHT, TextBlockAnchor.BOTTOM_CENTER, TextAnchor.BOTTOM_CENTER, -Math.PI / 2.0, CategoryLabelWidthType.CATEGORY, 0.9f), // LEFT
new CategoryLabelPosition(RectangleAnchor.LEFT, TextBlockAnchor.TOP_CENTER, TextAnchor.TOP_CENTER, -Math.PI / 2.0, CategoryLabelWidthType.CATEGORY, 0.90f))]
CategoryLabelPositions DOWN_90=Optional[new CategoryLabelPositions(new CategoryLabelPosition(RectangleAnchor.BOTTOM, TextBlockAnchor.CENTER_RIGHT, TextAnchor.CENTER_RIGHT, Math.PI / 2.0, CategoryLabelWidthType.RANGE, 0.30f), // TOP
new CategoryLabelPosition(RectangleAnchor.TOP, TextBlockAnchor.CENTER_LEFT, TextAnchor.CENTER_LEFT, Math.PI / 2.0, CategoryLabelWidthType.RANGE, 0.30f), // BOTTOM
new CategoryLabelPosition(RectangleAnchor.RIGHT, TextBlockAnchor.TOP_CENTER, TextAnchor.TOP_CENTER, Math.PI / 2.0, CategoryLabelWidthType.CATEGORY, 0.90f), // LEFT
new CategoryLabelPosition(RectangleAnchor.LEFT, TextBlockAnchor.BOTTOM_CENTER, TextAnchor.BOTTOM_CENTER, Math.PI / 2.0, CategoryLabelWidthType.CATEGORY, 0.90f))]
CategoryLabelPositions UP_45=Optional[createUpRotationLabelPositions(Math.PI / 4.0)]
CategoryLabelPositions DOWN_45=Optional[createDownRotationLabelPositions(Math.PI / 4.0)]
CategoryLabelPosition positionForAxisAtTop
CategoryLabelPosition positionForAxisAtBottom
CategoryLabelPosition positionForAxisAtLeft
CategoryLabelPosition positionForAxisAtRight
