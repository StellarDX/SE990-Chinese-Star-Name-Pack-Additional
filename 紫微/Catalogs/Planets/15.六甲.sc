// Object V* BN Cam  ---  alpha2 CVn Variable  ---  OID=@306083   (@@3414,5)  ---  coobox=2523 
// Object types: alpha2 CVn Variable,Near-IR Source (λ < 3 µm),Variable Star,Star,UV-emission Source
Star "BN Cam A"
{
	DateUpdated     "2024-04-29"
	ParentBody      "V* BN Cam"
	Class           "B9.5VpSi"
	AbsMagn         0.13
	MassSol         3.05
	RadSol          2.9
	LumBol          110
	Teff            11561
	RotationPeriod  65.59968

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.222167375
		Eccentricity    0.0463112062
		Inclination     -1.81753063
		AscendingNode   0
		ArgOfPericenter -33.078709
		MeanAnomaly     27.10258
	}
}

Star "BN Cam B"
{
	ParentBody      "V* BN Cam"
	Class           "F2.1?"
}