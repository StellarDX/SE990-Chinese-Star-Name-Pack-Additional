// Object * bet Cep  ---  beta Cep Variable  ---  OID=@251443   (@@6967,0)  ---  coobox=826 
// Object types: Variable Star,beta Cep Variable,Double or Multiple Star,Spectroscopic Binary,Variable Star,Near-IR Source (λ < 3 µm),beta Cep Variable,Star,Infra-Red Source,UV-emission Source,X-ray Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HD&number=205021
Remove "Alfirk A"{ParentBody "Alfirk"}
Remove "Alfirk B"{ParentBody "Alfirk"}
Remove "Alfirk Aa"{ParentBody "Alfirk A"}
Remove "Alfirk Ab"{ParentBody "Alfirk A"}
Barycenter "BET Cep A"
{
	ParentBody      "Gaia DR3 2272185759996420992"
	BinaryOrbit
	{
		Period          33188
		Separation      2857.14291673302 // 13.6"
	}
}

Star "BET Cep Aa"
{
	DateUpdated     "2024-04-27"
	ParentBody      "BET Cep A"
	Class           "B1IV"
	AbsMagn         -3.03
	MassSol         7.4
	RadSol          5.6
	LumBol          15100
	Teff            27000
	FeH             -0.23
	Age             0.0087

	BinaryOrbit
	{
		PeriodDays      29616.54
		Separation      43.4759032256835 // 206.96 mas
		Eccentricity    0.7478
		Inclination     88.80
		AscendingNode   227.83
		Epoch           2450944.5
		ArgOfPericenter 22.43
		MeanAnomaly     0
	}
}

// NoirLab说Aa旁边还有一颗0.16太阳质量的小星Aa2，但似乎还没确认
/*Star "BET Cep Aa2(?)"
{
	ParentBody      "BET Cep Aa"
	Class           ""
	MassSol         0.16

	Orbit // SB9_1310 1969ApJ...158..269F
	{
		PeriodDays      10.8930
		Eccentricity    0.520
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2433555.398
		ArgOfPericenter 338.0
		MeanAnomaly     0
	}
}*/

Star "BET Cep Ab"
{
	ParentBody      "BET Cep A"
	Class           ""
	MassSol         5
}

// Object * bet Cep B  ---  Star  ---  OID=@251343   (@@6961,5)  ---  coobox=826 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "BET Cep B/Gaia DR3 2272185755698491264/TIC 321818582/ADS 15032 B/BD+69 1173B/CCDM J21287+7034B/CSI+69 1173 2/GCRV 13521/GEN# +1.00205021B/HGAM 1008/IDS 21274+7007 B/ROT 3579/UBV 18544/2MASS J21283713+7033340/WDS J21287+7034B/** STF 2806B/GSC 04465-02644/TYC 4465-2644-1/PMSC 21274+7007B/UCAC4 803-032105/HD 205021B/WEB 19219/Gaia DR2 2272185755698491264" // B可能是光学伴星
{
	ParentBody      "Gaia DR3 2272185759996420992"
	Parallax        4.2104
	AppMagn         8.63
	Class           "A1V"
	AbsMagn         1.75 // 计算的值
	MassKg          5.50702424006835e+30 // log(g) = 4.130 cm/s^2
	RadSol          2.372681 // Gaia DR3
	LumBol          57.15144068084724 // 计算的值
	Teff            10303
	FeH             0.579
}

// Object * 79 Dra  ---  Spectroscopic Binary  ---  OID=@264679   (@@6632,1)  ---  coobox=918 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Star,UV-emission Source 
Star "79 Dra A"
{
	DateUpdated     "2024-04-27"
	ParentBody      "79 Dra"
	Class           "A2V"
	AbsMagn         2.05 // 计算的值

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   175.355429
		Eccentricity    0.386037377
		Inclination     -0.25433588
		AscendingNode   0
		ArgOfPericenter 160.692331
		MeanAnomaly     -76.7822918
	}
}

Star "79 Dra B"
{
	ParentBody      "79 Dra"
	Class           "G4.1?"
}

// Object * 31 Cep  ---  Spectroscopic Binary  ---  OID=@252042   (@@6313,3)  ---  coobox=923 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),High Proper Motion Star,Star,Infra-Red Source,UV-emission Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=111532
Barycenter "31 Cep A"
{
	ParentBody      "31 Cep"
	BinaryOrbit
	{
		Period          23733
		Separation      1319.84934781777 // 22.885"
	}
}

Star "31 Cep Aa"
{
	DateUpdated     "2024-04-27"
	ParentBody      "31 Cep A"
	Class           "F2II"
	AbsMagn         1.9 // 计算的值 (AppMagn = 5.70)
	MassKg          4.0733616465166e+30 // log(g) = 3.619 cm/s^2
	RadSol          3.675 // Gaia DR3
	LumBol          24.592546082592957 // 计算的值
	Teff            6705
	FeH             0.227

	BinaryOrbit // NSS SB2
	{
		PeriodDays      2 // 0.7236 (粘一块了)
		Eccentricity    0.065
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2457388.700
		ArgOfPericenter 27.6
		MeanAnomaly     0
	}
}

Star "31 Cep Ab"
{
	ParentBody      "31 Cep A"
	Class           ""
	MassSol         1.75
}

Star "31 Cep B"
{
	ParentBody      "31 Cep"
	Class           "WD?"
	MassSol         0.50
}

// Object * gam Cep  ---  Spectroscopic Binary  ---  OID=@265823   (@@5531,0)  ---  coobox=959 
// Object types: Spectroscopic Binary,Double or Multiple Star,Spectroscopic Binary,Near-IR Source (λ < 3 µm),Variable Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "GAM Cep A" {ParentBody "Errai"}
Remove "GAM Cep B" {ParentBody "Errai"}
Star "GAM Cep A"
{
	DateUpdated     "2024-04-27"
	ParentBody      "GAM Cep"
	Class           "K1III-IVCN1"
	AbsMagn         2.62
	MassSol         1.294
	RadSol          4.93
	LumBol          11.6
	Teff            4792
	FeH             -0.05
	Age             3.25

	BinaryOrbit
	{
		Period          66.84
		Separation      19.56
		Eccentricity    0.4144
		Inclination     120.18
		AscendingNode   18.32
		Epoch           2448469.559326562564820
		ArgOfPericenter 160.49
		MeanAnomaly     0
	}
}

Star "GAM Cep B"
{
	ParentBody      "GAM Cep"
	Class           "M4V"
	MassSol         0.384
}

// Object * gam Cep b  ---  Extra-solar Planet  ---  OID=@3749616   (@@135996,10)  ---  coobox=959 
// Object types: Extra-solar Planet,Star,Extra-solar Planet Candidate 
Remove "Tadmor" {ParentBody "Errai A"}
Planet	"GAM Cep b/HD 222404 b/Tadmor/Errai b"
{
	ParentBody     "GAM Cep A"
	DiscMethod     "RadVel"
	DiscDate       "2003"
	MassJup        9.4

	Surface {Preset "jupiter_cold_saturn.cfg"}
	Atmosphere
	{
		Model          "Earth"
		Height          300
		Bright          10
		Opacity         1
		SkyLight        3.3333
	}

	Orbit
	{
		Epoch           2453227
		PeriodDays      903.3
		SemiMajorAxis   2.05
		Eccentricity    0.049
		Inclination     9.6
		ArgOfPericen    94.6
	}
}

// Object * 21 Cas  ---  Eclipsing Binary  ---  OID=@253533   (@@4841,5)  ---  coobox=2329 
// Object types: Eclipsing Binary,Eclipsing Binary,Spectroscopic Binary,Double or Multiple Star,Near-IR Source (λ < 3 µm),Variable Star,Star,Infra-Red Source,UV-emission Source 
Remove "21 Cas (AB)"{ParentBody "21 Cas"}
Remove "TYC 4307-2168-1"{ParentBody "21 Cas"}
Remove "21 Cas A"{ParentBody "21 Cas (AB)"}
Remove "21 Cas B"{ParentBody "21 Cas (AB)"}
Barycenter "21 Cas AB"
{
	ParentBody      "HIP 3572"
	BinaryOrbit
	{
		Period          86580
		Separation      3000
	}
}

Star "21 Cas A"
{
	DateUpdated     "2024-04-27"
	ParentBody      "21 Cas AB"
	Class           "A1Vm"
	AbsMagn         +0.251
	MassSol         2.308
	RadSol          2.547
	LumBol          41.69
	Teff            9200

	BinaryOrbit
	{
		PeriodDays      4.467
		Separation      0.0812436630490089 // 17.47 RSun
		Eccentricity    0.0
		Inclination     88.332
	}
}

Star "21 Cas B"
{
	ParentBody      "21 Cas AB"
	Class           "F2V"
	MassSol         1.325
	RadSol          1.359
	LumBol          3.34
	Teff            6890
	FeH             +0.10
	Age             0.490 // 0.550
}

// Object TYC 4307-2168-1  ---  Star  ---  OID=@253509   (@@4828,20)  ---  coobox=2329 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "TYC 4307-2168-1/Gaia DR3 539047365205651072/TIC 275259734/2MASS J00454216+7458433/ADS 624 B/CCDM J00457+7459B/CSI+74 27 2/GEN# +1.00004161B/GSC 04307-02168/HD 4161B/UBV 593/WDS J00457+7459B/PMSC 00390+7426B/Gaia DR2 539047365203211008"
{
	ParentBody      "HIP 3572"
	Parallax        10.6605
	AppMagn         10.5
	Class           "K2"
	AbsMagn         5.64 // 计算的值
	MassSol         0.8
	RadSol          0.75425 // Gaia DR3
	LumBol          0.30597557373835277 // 计算的值
	Teff            4943
	FeH             0.029
}