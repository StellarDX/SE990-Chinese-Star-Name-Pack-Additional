// Object * psi Hya  ---  High Proper Motion Star  ---  OID=@2116012   (@@43468,6)  ---  coobox=15954 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Star "PSI Hya A"
{
	DateUpdated     "2024-05-21"
	ParentBody      "PSI Hya"
	Class           "K0III"
	AbsMagn         0.54
	MassKg          4.27612127359732e+30 // log(g) = 2.72 cm/s^2
	RadSol          10.6
	LumBol          56
	Teff            4680
	FeH             -0.19

	BinaryOrbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   34.8720511
		Eccentricity    0.111282484
		Inclination     0.603980303
		AscendingNode   0
		ArgOfPericenter 83.9710295
		MeanAnomaly     -176.944751
	}
}

Star "PSI Hya B"
{
	ParentBody      "PSI Hya"
	Class           "F4.8?"
}