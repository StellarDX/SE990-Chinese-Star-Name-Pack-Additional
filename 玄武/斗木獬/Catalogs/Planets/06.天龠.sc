// Object * 4 Sgr  ---  High Proper Motion Star  ---  OID=@2514091   (@@54825,1)  ---  coobox=17151 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Star,UV-emission Source 
Star "4 Sgr A"
{
	DateUpdated     "2024-06-01"
	ParentBody      "4 Sgr"
	Class           "B9V"
	AbsMagn         -0.77
	MassSol         3.23
	Radius          3847127.8640345 // 计算的值
	LumBol          240
	Teff            9661
	Oblateness      0.12280701754385964912280701754386 // Vsini = 149 Km/s

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.996857112
		Eccentricity    0.245331885
		Inclination     0.0447413921
		AscendingNode   0
		ArgOfPericenter -82.4825987
		MeanAnomaly     37.4994623
	}
}

Star "4 Sgr B"
{
	ParentBody      "4 Sgr"
	Class           "F4.5?"
}