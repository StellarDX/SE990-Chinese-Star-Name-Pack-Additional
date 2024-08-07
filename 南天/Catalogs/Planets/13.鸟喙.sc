// Object * eta Tuc  ---  Double or Multiple Star  ---  OID=@3293173   (@@73704,2)  ---  coobox=24072 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "ETA Tuc A"
{
	DateUpdated     "2024-08-05"
	ParentBody      "ETA Tuc"
	Class           "A1V"
	AbsMagn         1.62
	MassSol         1.94
	RadSol          1.8
	LumBol          23
	Teff            9057

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   41.259793
		Eccentricity    0.458273586
		Inclination     0.568092346
		AscendingNode   0
		ArgOfPericenter 99.7904931
		MeanAnomaly     -138.402502
	}
}

Star "ETA Tuc B"
{
	ParentBody      "ETA Tuc"
	Class           "K8.9?"
}