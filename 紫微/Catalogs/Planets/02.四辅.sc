// Object HD 81817  ---  Spectroscopic Binary  ---  OID=@366789   (@@4916,10)  ---  coobox=3099 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),White Dwarf,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "HD 81817 A"
{
	DateUpdated     "2024-04-27"
	ParentBody      "HD 81817"
	Class           "K3II-III"
	AbsMagn         -3.14
	MassSol         4.3
	RadSol          83.8
	LumBol          1822.9
	Teff            4140
	FeH             -0.17
	RotationPeriod  19224
	Age             0.150
}

Remove "HD 81817 b" {ParentBody "HD 81817"}
Remove "HD 81817 c" {ParentBody "HD 81817"}
// Object HD 81817B  ---  Extra-solar Planet  ---  OID=@15329434   (@@-1,255)  ---  coobox=3099 
// Object types: Extra-solar Planet,Star,Brown Dwarf Candidate 
Planet "HD 81817 b"
{
	ParentBody     "HD 81817 A"
	DiscMethod     "RadVel"
	DiscDate       "2020"
	MassKg         4.579796e+28

	Orbit // 官方数据
	{
		Epoch           2452830.869
		Period          2.79595737
		SemiMajorAxis   3.233953
		Eccentricity    0.097258
		Inclination     95.594
		ArgOfPericen    294.2305
	}
}

// Object HD 81817c  ---  Extra-solar Planet  ---  OID=@23935937   (@@-1,255)  ---  coobox=3099 
// Object types: Extra-solar Planet,Star 
Planet "HD 81817 c"
{
	ParentBody     "HD 81817 A"
	DiscMethod     "RadVel"
	DiscDate       "2022"
	MassKg         4.2914708125e+28

	Orbit // 官方数据
	{
		Epoch           2453031.768
		Period          1.705657331
		SemiMajorAxis   2.324089
		Eccentricity    0.095429
		ArgOfPericen    227.9632
	}
}