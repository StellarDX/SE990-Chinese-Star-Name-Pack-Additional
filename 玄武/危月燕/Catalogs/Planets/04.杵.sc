// Object * pi.01 Peg  ---  High Proper Motion Star  ---  OID=@1526342   (@@31614,8)  ---  coobox=9697 
// Object types: High Proper Motion Star,Red Giant Branch star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source 
Star "PI1 Peg A"
{
	DateUpdated     "2024-06-13"
	ParentBody      "PI1 Peg"
	Class           "G6III:"
	AbsMagn         0.84
	MassSol         2.48
	RadSol          11.00
	LumBol          62.8
	Teff            4898
	FeH             -0.22
	Age             0.530

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   7.51931457
		Eccentricity    0.778328572
		Inclination     -1.90924835
		AscendingNode   0
		ArgOfPericenter -99.2316365
		MeanAnomaly     -81.9618715
	}
}

Star "PI1 Peg B"
{
	ParentBody      "PI1 Peg"
	Class           "F8.3?"
}

// Object * 38 Peg  ---  Double or Multiple Star  ---  OID=@1527145   (@@32005,0)  ---  coobox=10048 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,UV-emission Source 
Star "38 Peg A"
{
	DateUpdated     "2024-06-13"
	ParentBody      "38 Peg"
	Class           "B9.5V"
	AbsMagn         0.231 // 计算的值
	MassKg          4.48105225144394e+30 // log(g) = 3.782 cm/s^2
	RadSol          3.195 // Gaia DR3
	LumBol          96.2337036664408 // 计算的值
	Teff            10114
	FeH             -0.832

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   150.2175
		Eccentricity    0.322471623
		Inclination     1.01519012
		AscendingNode   0
		ArgOfPericenter -175.101467
		MeanAnomaly     -123.566219
	}
}

Star "38 Peg B"
{
	ParentBody      "38 Peg"
	Class           "A4?"
}