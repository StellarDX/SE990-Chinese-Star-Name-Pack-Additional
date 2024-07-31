// Object HD 88215  ---  Spectroscopic Binary  ---  OID=@1701848   (@@35391,22)  ---  coobox=14552 
// Object types: Spectroscopic Binary,High Proper Motion Star,Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Star,UV-emission Source,X-ray Source 
Star "HD 88215 A"
{
	DateUpdated     "2024-07-31"
	ParentBody      "HD 88215"
	Class           "F3V"
	AbsMagn         3.08 // 计算的值

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   10.2998545
		Eccentricity    0.266012887
		Inclination     -1.03475189
		AscendingNode   0
		ArgOfPericenter -84.6096493
		MeanAnomaly     -164.139253
	}
}

Star "HD 88215 B"
{
	ParentBody      "HD 88215"
	Class           "G9.6?"
}