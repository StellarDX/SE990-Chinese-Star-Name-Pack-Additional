// Object * mu.02 Gru  ---  Star  ---  OID=@1145730   (@@75507,4)  ---  coobox=8354 
// Object types: Red Giant Branch star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Star "MU2 Gru A"
{
	DateUpdated     "2024-08-05"
	ParentBody      "MU2 Gru"
	Class           "G8III"
	AbsMagn         0.56
	RadSol          9.97
	LumBol          56.37
	Teff            5009

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.389574487
		Eccentricity    0.177658235
		Inclination     -1.37798047
		AscendingNode   0
		ArgOfPericenter 24.388962
		MeanAnomaly     -112.376528
	}
}

Star "MU2 Gru B"
{
	ParentBody      "MU2 Gru"
	Class           "F0.7?"
}

// Object * del01 Gru  ---  Star  ---  OID=@3405380   (@@75520,1)  ---  coobox=24319 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Variable Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "DEL1 Gru A"
{
	DateUpdated     "2024-08-05"
	ParentBody      "DEL1 Gru"
	Class           "G6III"
	AbsMagn         -1.1
	MassSol         4.0
	RadSol          24
	LumBol          305
	Teff            5013
	FeH             -0.23

	BinaryOrbit     
	{
		Separation      560.106518462369 // 5.6 asec
	}
}

Star "DEL1 Gru B"
{
	ParentBody      "DEL1 Gru"
	Class           "A3.9?"
}