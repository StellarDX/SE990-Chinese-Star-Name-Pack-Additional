// Object * 30 Com  ---  Double or Multiple Star  ---  OID=@1987487   (@@41212,0)  ---  coobox=13536 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,UV-emission Source 
Star "30 Com A"
{
	DateUpdated     "2024-05-05"
	ParentBody      "30 Com"
	Class           "A1Van"
	AbsMagn         1.15 // 计算的值
	MassKg          3.55344407612757e+30 // log(g) = 3.949 cm/s^2
	RadSol          2.3475 // Gaia DR3
	LumBol          30.525243869145 // 计算的值
	Teff            8855
	FeH             -0.613

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.886630985
		Eccentricity    0.0127724547
		Inclination     0.655622244
		AscendingNode   0
		ArgOfPericenter 8.74024789
		MeanAnomaly     60.2818004
	}
}

Star "30 Com B"
{
	ParentBody      "30 Com"
	Class           "F0.5?"
}