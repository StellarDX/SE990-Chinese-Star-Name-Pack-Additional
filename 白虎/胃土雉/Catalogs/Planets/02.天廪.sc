// Object * u Tau  ---  Spectroscopic Binary  ---  OID=@678223   (@@17797,11)  ---  coobox=4808 
// Object types: Spectroscopic Binary,Eclipsing Binary,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,UV-emission Source 
Star "29 Tau A"
{
	DateUpdated     "2024-06-26"
	ParentBody      "29 Tau"
	Class           "B3V"
	AbsMagn         -0.946 // 计算的值
	MassKg          9.48126595568466e+30 // log(g) = 3.872 cm/s^2
	RadSol          4.19 // Gaia DR3
	LumBol          801.158359715607 // 计算的值
	Teff            15002
	FeH             0.025

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   9.36000849
		Eccentricity    0.142231779
		Inclination     0.86795342
		AscendingNode   0
		ArgOfPericenter 107.079015
		MeanAnomaly     93.9935309
	}
}

Star "29 Tau B"
{
	ParentBody      "29 Tau"
	Class           "A0.1?"
}