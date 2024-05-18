// Object * o Her  ---  Spectroscopic Binary  ---  OID=@2680983   (@@50941,4)  ---  coobox=17593 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Star,UV-emission Source 
Star "21 Her A"
{
	DateUpdated     "2024-05-18"
	ParentBody      "21 Her"
	Class           "A1III"
	AbsMagn         0.66 // 计算的值

	BinaryOrbit     
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.129523938
		Eccentricity    0
		Inclination     -0.476787567
		AscendingNode   0
		ArgOfPericenter -74.8548532
		MeanAnomaly     21.669221
	}
}

Star "21 Her B"
{
	ParentBody      "21 Her"
	Class           "F9.5?"
}

// 11 Oph b, not on Simbad
Remove "11 Oph b" {ParentBody "11 Oph"}
Planet "11 Oph b"
{
	ParentBody     "28 Her"
	DiscMethod     "Imaging"
	DiscDate       "2007"
	MassKg         3.9860625e+28

	Orbit
	{
		PeriodDays      730000.0
		SemiMajorAxis   243.0
	}
}
