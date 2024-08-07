// Object * 4 Com  ---  Spectroscopic Binary  ---  OID=@1907620   (@@39079,9)  ---  coobox=13478 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Star,Star,Infra-Red Source 
Star "4 Com A"
{
	DateUpdated     "2024-05-06"
	ParentBody      "4 Com"
	Class           "K5III"
	AbsMagn         -0.292 // 计算的值
	MassKg          5.44903898617752e+30 // log(g) = 2.002 cm/s^2
	RadSol          27.34896 // Gaia DR3
	LumBol          282.520290756969 // 计算的值
	Teff            4525
	FeH             -0.042

	BinaryOrbit     
	{
		RefPlane        "Equator"
		SemiMajorAxis   116.856159
		Eccentricity    0.606070235
		Inclination     2.34162368
		AscendingNode   0
		ArgOfPericenter 57.597064
		MeanAnomaly     5.6457023
	}
}

Star "4 Com B"
{
	ParentBody      "4 Com"
	Class           "A3.6?"
}