// Object * 21 Oph  ---  Double or Multiple Star  ---  OID=@2652098   (@@51976,4)  ---  coobox=17930 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,UV-emission Source 
Star "21 Oph A"
{
	DateUpdated     "2024-05-17"
	ParentBody      "21 Oph"
	Class           "A0V"
	AbsMagn         0.26 // 计算的值
	// MassSol         // log(g) = 3.677 cm/s^2
	Teff            9268
	FeH             -1.031

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.207221584
		Eccentricity    0
		Inclination     -0.411132336
		AscendingNode   0
		ArgOfPericenter 149.853876
		MeanAnomaly     -83.3543354
	}
}

Star "21 Oph B"
{
	ParentBody      "21 Oph"
	Class           "A9.2?"
}