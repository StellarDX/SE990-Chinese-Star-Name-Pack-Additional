// Object * b Gem  ---  Spectroscopic Binary  ---  OID=@968740   (@@21361,11)  ---  coobox=5341 
// Object types: Spectroscopic Binary,Red Giant Branch star,Spectroscopic Binary,Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source 
Star "65 Gem A"
{
	DateUpdated     "2024-07-17"
	ParentBody      "65 Gem"
	Class           "K2III"
	AbsMagn         -0.552 // 计算的值
	MassKg          5.40749354859494e+30 // log(g) = 2.096 cm/s^2
	RadSol          24.45 // Gaia DR3
	LumBol          252.237834583609 // 计算的值
	Teff            4652
	FeH             -0.191

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.958582473
		Eccentricity    0
		Inclination     0.817834854
		AscendingNode   0
		ArgOfPericenter -19.8095247
		MeanAnomaly     100.255133
	}
}

Star "65 Gem B"
{
	ParentBody      "65 Gem"
	Class           "A4.7?"
}