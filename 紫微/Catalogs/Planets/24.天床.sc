// Object * 9 UMi  ---  Spectroscopic Binary  ---  OID=@390163   (@@7050,14)  ---  coobox=1641 
// Object types: Spectroscopic Binary,High Proper Motion Star,High Proper Motion Star,Spectroscopic Binary,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),High Proper Motion Star,Star,Infra-Red Source 
Remove "9 UMi A" {ParentBody "9 UMi"}
Remove "9 UMi B" {ParentBody "9 UMi"}
Star "9 UMi A"
{
	DateUpdated     "2024-05-02"
	ParentBody      "HIP 73440"
	Class           "G0"
	AbsMagn         3.9 // 计算的值
	MassKg          2.48908775458732e+30 // log(g) = 4.141 cm/s^2
	RadSol          1.575074 // Gaia DR3
	LumBol          2.23920840068706 // 计算的值
	Teff            5626
	FeH             -0.878

	BinaryOrbit // 未修改，需要引用
	{
		Period          1.2791
		Separation      0.1396
		Eccentricity    0.217
		Inclination     51.9
		AscendingNode   307.5
		ArgOfPericenter 10
		Epoch           2447349
		MeanAnomaly     0
	}
}

Star "9 UMi B"
{
	ParentBody      "HIP 73440"
	Class           "K4.5?"
}

// Object * 11 UMi b  ---  Extra-solar Planet  ---  OID=@5133545   (@@-1,255)  ---  coobox=1640 
// Object types: Extra-solar Planet,Star,Extra-solar Planet Candidate 
Remove "11 UMi b" {ParentBody "11 UMi"}
Planet "11 UMi b"
{
	ParentBody     "HIP 74793"
	DiscMethod     "RadVel"
	DiscDate       "2009"
	MassJup        10.50

	Orbit
	{
		Epoch           2452861.05
		PeriodDays      516.22
		SemiMajorAxis   1.54
		Eccentricity    0.08
		ArgOfPericen    117.63
	}
}