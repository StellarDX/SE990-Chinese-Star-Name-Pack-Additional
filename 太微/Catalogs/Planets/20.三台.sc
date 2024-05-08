// Object * 41 Lyn b  ---  Extra-solar Planet  ---  OID=@4079754   (@@-1,255)  ---  coobox=3948 
// Object types: Extra-solar Planet,Star,Extra-solar Planet Candidate 
Planet	"HD 81688 b/41 Lyn b/Arkas"
{
	ParentBody     "Intercrus"
	DiscMethod     "RadVel"
	DiscDate       "2008"
	MassKg         5.1249375e+27

	Orbit
	{
		Epoch           2452335.4
		PeriodDays      184.02
		SemiMajorAxis   0.81
		Eccentricity    0
		ArgOfPericen    0
	}
}

// Object * 19 LMi  ---  Spectroscopic Binary  ---  OID=@614534   (@@1915,5)  ---  coobox=3959 
// Object types: Spectroscopic Binary,High Proper Motion Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "19 LMi A"
{
	DateUpdated     "2024-05-08"
	ParentBody      "19 LMi"
	Class           "F6V"
	AbsMagn         2.86
	MassSol         1.29
	RadSol          2
	LumBol          6.41
	Teff            6483
	FeH             0.09
	Age             2.474

	BinaryOrbit     
	{
		PeriodDays      9.2835
		Eccentricity    0.048
		Epoch           2443858.21 
		ArgOfPericenter 171
		MeanAnomaly     0
	}
}

Star "19 LMi B"
{
	DateUpdated     "2024-05-08"
	ParentBody      "19 LMi"
	Class           ""
	MassSol         1.01
}

// Object * 62 UMa  ---  Spectroscopic Binary  ---  OID=@1841253   (@@38217,12)  ---  coobox=12754 
// Object types: Spectroscopic Binary,High Proper Motion Star,High Proper Motion Star,Double or Multiple Star,Spectroscopic Binary,Near-IR Source (λ < 3 µm),Star,UV-emission Source 
Star "62 UMa A"
{
	DateUpdated     "2024-05-08"
	ParentBody      "62 UMa"
	Class           "F5"
	AbsMagn         2.64 // 计算的值
	MassSol         1.13439722205857 // log(g) = 3.76 cm/s^2
	RadSol          2.325 // Gaia DR3
	LumBol          7.21484074575712 // 计算的值
	Teff            6204
	FeH             -0.634

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.715600152
		Eccentricity    0.70725854
		Inclination     2.28161472
		AscendingNode   0
		ArgOfPericenter -158.540373
		MeanAnomaly     -79.2238287
	}
}

Star "62 UMa B"
{
	ParentBody      "62 UMa"
	Class           "G8?"
}