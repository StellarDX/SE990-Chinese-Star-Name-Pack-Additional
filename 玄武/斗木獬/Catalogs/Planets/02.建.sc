// Object * nu.01 Sgr  ---  Star  ---  OID=@2523163   (@@57921,0)  ---  coobox=18647 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=92761
Barycenter "NU1 Sgr A"
{
	ParentBody      "NU1 Sgr"
	BinaryOrbit     
	{
		Period          8039
		Separation      1355.84914878821 // 2.493 asec
	}
}

Star "NU1 Sgr Aa"
{
	DateUpdated     "2024-05-31"
	ParentBody      "NU1 Sgr A"
	Class           "G2Ib"
	AbsMagn         -3.91
	MassSol         13.88
	RadSol          101
	LumBol          3464
	Teff            4401

	BinaryOrbit     
	{
		PeriodDays      370
		Separation      2.22551335475847 // 3.027 mas
	}
}

Star "NU1 Sgr Ab"
{
	DateUpdated     "2024-05-31"
	ParentBody      "NU1 Sgr A"
	Class           "B9.2Vp"
	MassSol         3.84
}

Star "NU1 Sgr B"
{
	DateUpdated     "2024-05-31"
	ParentBody      "NU1 Sgr"
	Class           ""
	MassSol         1.55
}

// Object * nu.02 Sgr  ---  High Proper Motion Star  ---  OID=@2523165   (@@57921,2)  ---  coobox=18647 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Star,Infra-Red Source 
Star "NU2 Sgr A"
{
	DateUpdated     "2024-05-31"
	ParentBody      "NU2 Sgr"
	Class           "K3II-III:CN1Ba1"
	AbsMagn         0.38
	MassSol         1.44
	RadSol          85
	LumBol          120
	Teff            4244
	FeH             -0.13
	Age             4.52

	BinaryOrbit     
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.23776156
		Eccentricity    0
		Inclination     -1.82870293
		AscendingNode   0
		ArgOfPericenter 154.84488
		MeanAnomaly     177.496733
	}
}

Star "NU2 Sgr B"
{
	ParentBody      "NU2 Sgr"
	Class           "WD"
}

// Object HD 180562A  ---  Star  ---  OID=@11735258   (@@-1,255)  ---  coobox=18855 
// Object types: Double or Multiple Star,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Star,UV-emission Source 
Star "HD 180562 A"
{
	DateUpdated     "2024-05-31"
	ParentBody      "HD 180562"
	Class           "A3/5V"
	AbsMagn         1.29 // 计算的值

	BinaryOrbit     
	{
		Separation      1158.03425146597 // 8.21 asec
	}
}

// Object HD 180562B  ---  Star  ---  OID=@2569324   (@@58946,16)  ---  coobox=18866 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star 
Star "HD 180562 B/Gaia DR3 4183973727481346560/WISEA J191740.13-155753.1/TIC 130630787/ADS 12266 B/BD-16 5253B/CCDM J19177-1558B/CSI-16 5253 1/GC 26591/SAO 162418/WDS J19177-1558B/** S 715B/TYC 6296-2026-1/2MASS J19174012-1557535/UCAC4 371-165734/WISE J191740.14-155753.3/Gaia DR2 4183973727481346560"
{
	DateUpdated     "2024-05-31"
	ParentBody      "HD 180562"
	Parallax        7.0068
	AppMagn         7.87
	Class           "A2/3V"
	AbsMagn         2.1 // 计算的值
	MassKg          2.80547144454604e+30 // log(g) = 3.899 cm/s^2
	RadSol          2.209448 // Gaia DR3
	LumBol          15.1971832692132 // 计算的值
	Teff            7667
	FeH             -0.945
}
