// Object * psi Sco  ---  Star  ---  OID=@2579321   (@@50319,14)  ---  coobox=16821 
// Object types: Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Star "PSI Sco A"
{
	DateUpdated     "2024-05-28"
	ParentBody      "PSI Sco"
	Class           "A1V"
	AbsMagn         1.55
	MassSol         2.0
	RadSol          2.2
	LumBol          18.6
	Teff            8846
	Age             0.451

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   206.369359
		Eccentricity    0.704318767
		Inclination     -0.124864578
		AscendingNode   0
		ArgOfPericenter 102.386971
		MeanAnomaly     113.425234
	}
}

Star "PSI Sco B"
{
	ParentBody      "PSI Sco"
	Class           "F3.3?"
}

// Object NAME 17 Sco b  ---  Extra-solar Planet Candidate  ---  OID=@16480451   (@@-1,255)  ---  coobox=16822
// Object types: Extra-solar Planet Candidate
Planet "17 Sco b"
{
	ParentBody     "17 Sco"
	DiscMethod     "RadVel"
	DiscDate       "2020"
	Class          "GasGiant"
	MassJup        4.32

	Orbit
	{
		Epoch           2453294.41
		PeriodDays      573.4
		SemiMajorAxis   1.45
		Eccentricity    0.06
		ArgOfPericen    57.03
	}
}